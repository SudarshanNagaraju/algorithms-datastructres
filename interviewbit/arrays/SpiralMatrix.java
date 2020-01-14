package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		
		
		int A=9;
		
		
		int minrow=0;
		int maxrow=A-1;
		int mincol=0;
		int maxcol=A-1;
		int value=1;
		
		
		int[][] spiral=new int[A][A];
		
		
		while(value<=A*A) {
			
			
			for(int i=mincol;i<=maxcol;i++) {
				
				spiral[minrow][i]=value;
				value++;
			}
			
			
			for(int i=minrow+1;i<=maxrow;i++) {
				
				spiral[i][maxcol]=value;
				value++;
			}
			
			for(int i=maxcol-1;i>=mincol;i--) {
				
				spiral[maxrow][i]=value;
				value++;
			}
			
			for(int i=maxrow-1;i>minrow;i--) {
				spiral[i][mincol]=value;
				value++;
			}
			
			minrow++;
			maxrow--;
			mincol++;
			maxcol--;
			
		}
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> sublist=new ArrayList<Integer>();
		
		for(int i=0;i<A;i++) {
			sublist=new ArrayList<Integer>();
			for(int j=0;j<A;j++) {
				System.out.print(" "+spiral[i][j]);
				sublist.add(spiral[i][j]);
			}
			
			System.out.println();
			
			list.add(sublist);
			
		}
		
		

	}

}
