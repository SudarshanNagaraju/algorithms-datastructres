package com.sixdee.test.datastructures.string;

public class PangramCheck {

	public static void main(String[] args) {
		
		
		String str="ABCDEF";
		
		boolean[] mark=new boolean[26];
		
		int index=0;
		
		char st='a';
		//System.out.println("Ascii"+(st-'A'));
		
		for(int i=0;i<str.length();i++) {
			
			 if (str.charAt(i)>='A' && 
	                    str.charAt(i) <= 'Z') {
	                         
	                index = str.charAt(i) - 'A';
	 
	                // If lowercase character, subtract 'a'
	                // to find index.
			 }else if(str.charAt(i)>='a' && 
	                        str.charAt(i) <= 'z')
	                             
	                index = str.charAt(i) - 'a';
	 
	            // Mark current character
	            mark[index] = true;
			
			
			
		}
		
		
		for(int j=0;j<mark.length;j++) {
			if(mark[j]==false) {
			System.out.println(j);
			}
		}
		
		

	}

}
