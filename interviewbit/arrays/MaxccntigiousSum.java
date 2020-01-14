package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class MaxccntigiousSum {

	public static void main(String[] args) {
		
		
ArrayList<Integer> A=new ArrayList<Integer>();
		
		
A.add(-1);
A.add(-1);
A.add(-1);
A.add(-1);
		int max_so_far = 0,
		        max_ending_here = 0,start = 0,
		        end = 0, s = 0;
		 
		        for (int i = 0; i <A.size(); i++) 
		        {
		            max_ending_here += A.get(i);
		 
		            if (max_so_far <= max_ending_here ) 
		            {
		                max_so_far = max_ending_here;
		                start = s;
		                end = i;
		            }
		 
		            
		            if (max_ending_here < 0 || A.get(i)<0) 
		            {
		                max_ending_here = 0;
		                s = i + 1;
		            }
		        }
		        
		        ArrayList<Integer> ans=new ArrayList<Integer>();
		        for(int j=start;j<=end;j++) {
		        	ans.add(A.get(j));
		        }
		        System.out.println("Maximum contiguous sum is "
		                           + max_so_far);
		        System.out.println("Starting index " + start);
		        System.out.println("Ending index " + end);

	}

}
