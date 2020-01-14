package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatandMissingNumberArray {

	
	/*void repeatMissing(int[] A){
		int n=A.length;
	    int sum=0;
	    int sumsq=0;
	    for(int i=0;i<n;i++)
	    {
	        sum+=A[i];
	        sumsq+=(A[i]*A[i]);
	    }
	    
	    int diff = (n*(n+1)/2)-sum;
	    
	    int diff2 = ((n*(n+1)*(2*n+1))/6)-sumsq;
	    
	    int sumi = diff2/diff;

	    int repeated = (sumi-diff)/2;
	    
	    int missing = (diff+sumi)/2;
	    
	    System.out.println("Repeat"+repeated);
	    System.out.println("Missing"+missing);
	}
	*/
	
	
	public static void main(String[] args) {
		
		
		
		int[] A= {3,1,2,5,3};
		int[] B= new int[2];
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		
		
		
		for(int i=0;i<A.length;i++) {
			
			if(map.get(A[i])==null) {
				map.put(A[i], 1);
			}else {
			map.put(A[i], map.get(A[i])+1);
			}
			
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0;
		for(Integer key:map.keySet()) {
			sum=sum+key;
			list.add(key);
			if(map.get(key)>1) {
				B[0]=key;
				//System.out.println("Duplicate:"+key);
			}
			
		}
		
		int n=list.get(list.size()-1);
		
		B[1]=((n*(n+1)/2)-sum);
		//System.out.println("Missing number"+B[1]);
		
		
		

	}

}
