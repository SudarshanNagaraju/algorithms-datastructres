package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxDistance {

	
	static int min(int a,int b) {
		
		return a>b?b:a;
		
	}
	
	static int max(int a,int b) {
		
		return a>b?a:b;
		
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> A=new ArrayList<Integer>();
		
		A.add(1);
		A.add(10);
		/*A.add(4);
		A.add(2);*/
		
		int n=A.size();
		
		
		if(n==1) {
			
		}
		
		int[] leftMin=new int[A.size()];
		int[] rightMax=new int[A.size()];
		
		leftMin[0] =A.get(0);
		
		for(int i=1;i<A.size();++i) {
			leftMin[i]=min(leftMin[i-1],A.get(i));
		}
		
		rightMax[n-1]=A.get(n-1);
		
		for(int i=n-2;i>=0;--i) {
			rightMax[i]=max(rightMax[i+1],A.get(i));
		}
		
		
		int i = 0; int j = 0; int maxDiff = -1;
        while (j < n && i < n) 
        {
            if (leftMin[i] < rightMax[j]) 
            {
                maxDiff = max(maxDiff, j - i);
                j = j + 1;
            } 
            else
                i = i + 1;
        }
 
        
        System.out.println("Max diff"+maxDiff);
		
		

	}

}
