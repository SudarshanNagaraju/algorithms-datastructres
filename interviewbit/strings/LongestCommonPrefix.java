package com.sixdee.test.interviewbit.strings;

import java.util.ArrayList;

public class LongestCommonPrefix {

	static boolean checkPrefix(ArrayList<String> lis,int mid) {
		
		String str=lis.get(0).substring(0, mid);
		//System.out.println("str"+str);
		for(int i=1;i<lis.size();i++) { 
			if(!lis.get(i).startsWith(str)) {
				return false;
			}
		}
			return true;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> A=new ArrayList<String>();
		
		
		A.add("abcdefgh");
		A.add("aefghijk");
		A.add("abcefgh");
		
		
		if(A.size()<2) {
			
		}
		int minLen=Integer.MAX_VALUE;
		
		for(int i=0;i<A.size();i++) {
			
			minLen=Math.min(minLen, A.get(i).length());
		}
		
		
		int low=1;
		int high=minLen;
		
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(!checkPrefix(A,mid)) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			
			System.out.println("High"+high);
			System.out.println("low"+low);
		}
		
		System.out.println("String:"+A.get(0).substring(0, (low+high)/2));
		
		
	}

}
