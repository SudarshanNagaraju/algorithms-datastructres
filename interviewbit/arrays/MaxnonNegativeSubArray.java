package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class MaxnonNegativeSubArray {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		
		/*A.add(1);
		A.add(2);
		A.add(5);
		A.add(-7);
		A.add(2);
		A.add(5);*/
		
		//A.add(1477171087);
		
		
	/*A.add(39194);
		A.add(51295);
		A.add(33419);
		A.add(63443);
		A.add(68706);
		A.add(26593);
		A.add(31226);*/
//		
		
		A.add(0);
		A.add(0);
		A.add(-1);
		A.add(0);
		
		/*A.add(846930886);
		A.add(1714636915);
		A.add(-424238335);
		A.add(-1649760492);*/
		
		
		
		
		
		
		
	int sum=0;
		int permSum=0;
		int count=0;
		int permCount=0;
		int index=0;
		
		int startIndex=0;
		int endIndex=0;
		
		
		/*if(A.size()==1) {
			return A;
		}*/
		
		int opp=A.size();
		
		for(int i=0;i<A.size();i++) {
			
			if(A.get(i)>=0) {
				startIndex=i;
				count++;
				sum=sum+A.get(i);
				
			}else {
				count=0;
				sum=0;
				
			}
			
			if(sum>permSum) {
				permSum=sum;
				permCount=count;
				index=i;
			}else if(sum==permSum) {
				if(permCount<count) {
					permSum=sum;
					permCount=count;
					index=i;
				}
			}
			
			
			
		}
		
		
		System.out.println("Per Sum"+permSum);
		System.out.println("Perm Count"+permCount);
		System.out.println("Start Index"+startIndex);
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		index=index+1;
		System.out.println("Index"+index);
		
		if(permCount==1) {
			list.add(A.get(index-permCount));
		}
		
		
		for(int i=index-permCount;i<permCount;i++) {
		list.add(A.get(i));
		System.out.print(" "+A.get(i));
		
		}
		
		
		
		

	}

}
