package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		Collections.sort(A);
		
		Integer[] arr=new Integer[A.size()];

		for(int i=0;i<arr.length;i++) {
			arr[i]=A.get(i);
		}
		
		
		int n=A.size();
		// Swap adjacent elements
		for (int i=0; i<n-1; i += 2) {
			swap(arr,i,i+1);
			
			
		}

		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		
	}
	
	
	public static void swap(Integer[] B,int a,int b){
		int temp=B[a];
		B[a]=B[b];
		B[b]=temp;
				
	}

}
