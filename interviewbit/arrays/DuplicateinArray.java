package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class DuplicateinArray {

	public static void main(String[] args) {
		
		
		  
		ArrayList<Integer>  a=new ArrayList<Integer>();
 		
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(3);
		
		int[] arr=new int[a.size()];
		
		
for(int j=0;j<a.size();j++) {
	arr[j]=a.get(j);
}
		
        for(int i=0;i<arr.length;i++) {
        	
        	if(arr[Math.abs(a.get(i))]>=0) {
        		arr[Math.abs(a.get(i))]=-arr[Math.abs(a.get(i))];
        	}else {
        		System.out.print(" "+arr[i]);
        	}
        	
        }
		
		
		
	}

}
