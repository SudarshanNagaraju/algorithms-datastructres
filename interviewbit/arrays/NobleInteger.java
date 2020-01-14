package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class NobleInteger {

	public static void main(String[] args) {
		
		
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		
		arr.add(5);
		arr.add(6);
		arr.add(2);
		
		Object[] A=arr.toArray();
		
		Arrays.sort(arr.toArray());
		
		int n=arr.size();
		
		for(int i=0;i<A.length;i++) {
			
			
			System.out.print("A[i]"+arr.get(i)+"n"+(n-i-1));
			
			
			
		}
		
		

	}

}
