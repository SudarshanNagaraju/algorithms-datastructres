package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class RotateMatrix {

	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		b.add(13);
		b.add(9);
		b.add(5);
		b.add(1);
		
		a.add(b);
		
		
		b=new ArrayList<Integer>();
		
		
		b.add(14);
		b.add(10);
		b.add(6);
		b.add(2);
		
		a.add(b);
		
		
		
		
		
		
	
		/*int[][] mat=new int[a.size()][a.size()];
		
		for(int i=0;i<a.size();i++) {
		ArrayList<Integer> B=a.get(i);
		
		for(int j=0;j<B.size();j++) {
			mat[i][j]=B.get(j);
		}
		
		}*/
		
		 
		 int[][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 
		 
		 //transpose of matrix
		 /*for(int i=0;i<mat.length;i++) {
			 for(int j=0;j<mat.length;j++) {
				 System.out.print(" "+mat[i][j]);
				 
			 }
			 System.out.println();
		 }*/
		 /*for(int i=0;i<mat.length;i++) {
			 for(int j=i+1;j<mat.length;j++) {
				 System.out.print(" "+mat[i][j]);
				 System.out.println();
				 System.out.print(" "+mat[j][i]);
				 System.out.println();
				 int temp=mat[i][j];
				 mat[i][j]=mat[j][i];
				 mat[j][i]=temp;
			 }
			 
		 }*/
		 
		 
		/* for(int i=0;i<mat.length;i++) {
			 for(int j=0;j<mat.length;j++) {
				 System.out.print(" "+mat[i][j]);
				 
			 }
			 System.out.println();
		 }*/
		 
		 
		 System.out.println("after");
		 
		 int len = mat.length;
		 for(int i = 0; i < len; i++){
		        for(int j = 0; j < len ; j++){
		            
		        	System.out.print(" "+mat[len-1-j][i]);
		        }
		        System.out.println();
		    }
		 
		    /*for(int i=0;i<mat.length;i++) {
				 for(int j=0;j<mat.length;j++) {
					 System.out.print(" "+mat[i][j]);
					 
				 }
				 System.out.println();
			 }*/

	}

}
