package com.sixdee.test.datastructures.string;

public class LongestSubstring {

	public static void main(String[] args) {

		
		String str="abcabcbb";
		if(str.length()>0) {
		String str2=String.valueOf(str.charAt(0));
		String permStr="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(!str2.contains(String.valueOf(c))) {
				
				str2+=String.valueOf(c);
				//System.out.println("if"+str2);
				permStr=str2;
			}else {
				//System.out.println("else"+str2);
				str2="";
				str2+=String.valueOf(c);
			}
			
			
		}
		
		if(permStr.length()>str2.length()) {
			System.out.println("Perm"+permStr);
		//return permStr.length();
		}else {
			System.out.println("str2"+str2.length());
			//return str2.length();
		}
		}else {
			//return 0;
		}
		

	}

}
