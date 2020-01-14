package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

	private static void reverse(ArrayList<Integer> nums, int start) {
        int i = start, j = nums.size() - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(ArrayList<Integer> nums, int i, int j) {
    	Collections.swap(nums, i, j);
    }
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>  a=new ArrayList<Integer>();
		
		
		int i = a.size() - 2;
        while (i >= 0 && a.get(i+1) <= a.get(i)) {
            i--;
        }
        if (i >= 0) {
            int j = a.size() - 1;
            while (j >= 0 && a.get(j) <= a.get(i)) {
                j--;
            }
            swap(a, i, j);
        }
        reverse(a, i + 1);
		
		

	}

}
