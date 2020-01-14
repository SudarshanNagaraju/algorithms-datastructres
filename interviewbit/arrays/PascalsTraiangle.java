package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class PascalsTraiangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A=0;
		int B=1;
		int n=5;
		
		int[][] pas=new int[5][5];
		
		
		
		
		
		
		
		for(int row=0;row<n;row++) {
			for(int col=0;col<=row;col++) {
				if(col==0) {
					pas[row][col]=1;
				}else {
					pas[row][col]=pas[row-1][col]+pas[row-1][col-1];
				}
			}
		}
		
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sublist=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			sublist=new ArrayList<Integer>();
			for(int j=0;j<n;j++) {
				System.out.print(" "+pas[i][j]);
				if(pas[i][j]!=0) {
				sublist.add(pas[i][j]);
				}
			}
			System.out.println();
			list.add(sublist);
		}
		
		
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		int k=2;
		for(int i=k;i<=k;i++) {
			newlist=list.get(i);
		}
		for(int l=0;l<newlist.size();l++) {
			System.out.print(""+newlist.get(l));
		}
		
	}

}
