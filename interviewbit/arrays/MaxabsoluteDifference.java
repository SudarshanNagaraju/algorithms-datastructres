package com.sixdee.test.interviewbit.arrays;

public class MaxabsoluteDifference {

	
	int max(int n1,int n2) {
		
		return n1>n2?n1:n2;
		
	}
	
	public int maxArr(int[] A) {
	int n=A.length,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE,max4=Integer.MIN_VALUE,ans=Integer.MIN_VALUE;
	for(int i=0;i<n;i++){
	    max1=max(max1,A[i]+i);
	    max2=max(max2,-A[i]+i);
	    max3=max(max3,A[i]-i);
	    max4=max(max4,-A[i]-i);
	}
	for(int i=0;i<n;i++){
	    ans=max(ans,max1-A[i]-i);
	    ans=max(ans,max2+A[i]-i);
	    ans=max(ans,max3-A[i]+i);
	    ans=max(ans,max4+A[i]+i);
	}
	return ans;
	
	}
	public static void main(String[] args) {
		
		
		MaxabsoluteDifference diff=new MaxabsoluteDifference();
		
		int[] A= {1, 3, -1};
		
		System.out.println("Diff"+diff.maxArr(A));
		
		

	}

}
