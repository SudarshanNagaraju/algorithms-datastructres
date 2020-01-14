package com.sixdee.test.interviewbit.arrays;

public class Nby3RepeatNumber {

	public static void main(String[] args) {
		
		
		
		System.out.println(method());
		
		

	}

	
	public static int method() {
int[] A={1,2,2,2,5,6,7,8,34};
		
		
		int n=A.length;
	    int element1=Integer.MAX_VALUE,element2=Integer.MAX_VALUE;
	    int count1=0,count2=0,i;
	    for(i=0;i<n;i++){
	    	if(count1>0 && A[i]==element1){
	    		count1+=1;
	    	}else if(count2>0 && A[i]==element2){
	    		count2+=1;
	    	}else if(count1==0){
	    		element1=A[i];
	    		count1=1;
	    	}else if(count2==0){
	    		element2=A[i];
	    		count2=1;
	    	}else{
	    		count1--;
	    		count2--;
	    	}
	    }
	   int check,freq=0;
	    if(count1==0 && count2==0) {
	    	return -1;
	    	
	    }
	    else check=element1;
		for(i=0;i<n;i++){
	    	if(A[i]==check)
	    		freq++;
	    }
	    if(freq>n/3)
	    	return check;
	    check=element2;
	    freq=0;
	    for(i=0;i<n;i++){
	    	if(A[i]==check)
	    		freq++;
	    }
	    if(freq>n/3)
	    	return check;
	    return -1;
	}
}
