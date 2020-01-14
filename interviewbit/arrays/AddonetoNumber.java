package com.sixdee.test.interviewbit.arrays;


import java.util.ArrayList;
import java.util.List;

public class AddonetoNumber {

	
	int[] plusOne(int[] A) {
		
		int carry=1;
		
		
		List<Integer>  tempA=new ArrayList<Integer>();
		
		
		
		/*if(A.length==1) {
			A[0]=A[0]+1;
			return A;
		}*/
 		
		int count=0;
		
		
		for(int i=0;i<A.length;i++) {
			count++;
			if(A[i]!=0){
				break;
			}
		}
		
		//System.out.println("Count"+count+"A length"+A.length);
		if(count<=A.length) {
		for(int i=count-1;i<A.length;i++) {
			tempA.add(A[i]);
		}
		}
		
		
		
		A=new int[tempA.size()];
		
		

		for(int i=0;i<tempA.size();i++) {
			A[i]=tempA.get(i);
		}
		
		
		
		//System.out.print(" I "+i+" A "+A.get(i));
		for(int i=A.length-1;i>=0;i--) {
			
			
			A[i]=(carry+A[i]);
			if(A[i]>9) {
				A[i]=(A[i])%10;
				carry=1;
			}else {
			carry=0;
			}
			
			
		}
		
		
		//System.out.println("<<<<<<<Carry>>>>>>>>>"+carry+"A lenth"+A.length);
	
		int[] B=null;
		
		if(carry>0 && (A.length>=1)) {
			
			B=new int[A.length+1];
			B[0]=carry;
	
			
			for(int i=0;i<A.length;i++) {
				B[i+1]=A[i];
			}
			
		}else {
			B=new int[A.length];

			for(int i=0;i<A.length;i++) {
				B[i]=A[i];
			}
		}
		
		
		/*for(int i=0;i<B.length;i++) {
			System.out.print(" "+B[i]);
		}*/
		
		
		return B;
		
	}
	
	
	public static void main(String[] args) {

		
		
		//int[] A= {0,0,9, 3, 7, 6, 4, 0, 5, 5, 5};
		
		int[] A= {8};
		
		
		AddonetoNumber one=new AddonetoNumber();
		
		
	A=one.plusOne(A);
		
		for(int i=0;i<A.length;i++) {
			System.out.print(" "+A[i]);
		}
		

	}

}
