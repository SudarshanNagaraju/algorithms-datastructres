package com.sixdee.test.datastructures.string;

import java.util.HashMap;

public class RemoveDuplicate {

	
	
	
	
	static boolean duplicate(String str){
		
		if(str.length()>1) {
			
			
			HashMap<Character,Integer> dup=new HashMap<Character,Integer>();
			
			
			
			for(int i=0;i<str.length();i++) {
				
				char c=str.charAt(i);
				
				
				if(dup.get(c)!=null) {
				dup.put(c, dup.get(c)+1);
				}else {
					dup.put(c, 1);
				}
				
			}
			
			int count=0;
			
			for(Character ch:dup.keySet()) {
				
			   if(count>1) {
				   return false;
			   }
				
				if(dup.get(ch)>1) {
					count++;
				}
				
				
			}
			
			return true;
			
		}else {
			return true;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		/*//using index
		//remove any duplicate character
		String str="su dar shan";
		
		
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			if(c!=' ') {
				str2+=c;
			}
			
			if(str2.indexOf(c)<0) {
			System.out.print(" "+str2.indexOf(c));
			str2+=c;
			}
		}
		
		System.out.println("String 2:"+str2);*/
		
		
		
		//remove duplicate 
		//one remove operation valid
		//We are limited to removing only one character not multiple, so more than duplicate  is invalid.
		
		
		String dupStr="aabcd";
		
		System.out.println("Valid or not:"+duplicate(dupStr));
		
		

	}

}
