package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumConsecutiveGap {

	public static void main(String[] args) {
		
		List<Integer> A=new ArrayList<Integer>();
		
		
		
		//solution link below>>>>>>>>>>>>>>
		//http://www.zrzahid.com/the-%E2%80%A9maximum%E2%80%A9-gap%E2%80%A9-problem-%E2%80%A9pigeonhole-%E2%80%A9principle%E2%80%A9/
		
		A.add(5);
		A.add(3);
		A.add(1);
		A.add(8);
		A.add(9);
		A.add(2);
		A.add(4);
		
		int[] a=new int[A.size()];
		for(int i=0;i<A.size();i++) {
			a[i]=A.get(i);
		}
		
		
		
		int n = a.length;
		if(n < 2){
			//return 0;
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		
		//n-1 buckets -  we only care about max and min in each buckets
		int[] bucketMaxima = new int[n-1];
		
		Arrays.fill(bucketMaxima, Integer.MIN_VALUE);
		int[] bucketMinima = new int[n-1];
		Arrays.fill(bucketMinima, Integer.MAX_VALUE);
		
		//bucket width
		float delta = (float)(max-min)/((float)n-1);
		
		System.out.println("Delta"+delta);
		System.out.println();
		//populate the bucket maxima and minima
		for(int i = 0; i < n; i++){
			if(a[i] == max || a[i] == min){
				continue;
			}
			
			int bucketIndex = (int) Math.floor((a[i]-min)/delta);
			
			System.out.println("bucketIndex"+bucketIndex);
			
			bucketMaxima[bucketIndex] = bucketMaxima[bucketIndex] == Integer.MIN_VALUE ? a[i] : Math.max(bucketMaxima[bucketIndex], a[i]);
			bucketMinima[bucketIndex] = bucketMinima[bucketIndex] == Integer.MAX_VALUE ? a[i] : Math.min(bucketMinima[bucketIndex], a[i]);
		}
		
		//find the maxgap - maxgaps
		int prev =  min;
		int maxGap = 0;
		for(int i = 0; i< n-1; i++){
			//empty bucket according to Pigeonhole principle
			if(bucketMinima[i] == Integer.MAX_VALUE){
				continue;
			}
			
			maxGap = Math.max(maxGap, bucketMinima[i]-prev);
			prev = bucketMaxima[i];
		}
		
		maxGap = Math.max(maxGap, max-prev);
		

	}

}
