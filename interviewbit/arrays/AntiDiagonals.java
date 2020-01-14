package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class AntiDiagonals {

	public static void main(String[] args) {
		
		
		
		/*sublist.add(1);
		sublist.add(2);
		sublist.add(3);
		
		list.add(sublist);
		
		
		sublist=new ArrayList<Integer>();
		sublist.add(4);
		sublist.add(5);
		sublist.add(6);
		
		list.add(sublist);
		sublist=new ArrayList<Integer>();
		sublist.add(7);
		sublist.add(8);
		sublist.add(9);
		
		list.add(sublist);*/

		
		/*System.out.println("Size"+list.size());
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				System.out.print(" "+list.get(j).get(i));
			}
			
			System.out.println();
			
		}*/
		
		ArrayList<Integer> sublist=new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		
		int size=list.size();
		
		for(int i=0;i<size;i++) {
			int j=0;
			int k=i;
			sublist=new ArrayList<Integer>();
			while(k>=0) {
				sublist.add(list.get(j).get(k));
				//System.out.print(" "+list.get(j).;get(k));
				j=j+1;
				k=k-1;
			}
			
			list.add(sublist);
			//System.out.println();
			
		}
		
		for(int i=1;i<size;i++) {
			int j=size-1;
			int k=i;
			sublist=new ArrayList<Integer>();
			while(k<size) {
				sublist.add(list.get(k).get(j));
				//System.out.print(" "+list.get(k).get(j));
				j=j-1;
				k=k+1;
			}
			list.add(sublist);
			//System.out.println();
			
		}
		
		
		
		
	}

}
