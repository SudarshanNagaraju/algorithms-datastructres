package com.sixdee.test.interviewbit.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class Colorful {

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	
	public static void main(String[] args) {
		
		
		String str="23";
		
		
		ArrayList<String> arr=new ArrayList<String>();
		
		StringBuffer strbuff=new StringBuffer();
		//System.out.println(str.substring(0, 4));
		
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<=str.length();j++) {
				//strbuff.append(str.substring(i, j));
				arr.add(str.substring(i,j));
			System.out.println(""+str.substring(i, j));
			
		}
		
		}
		
		System.out.println("Size of list"+arr.size());
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.size();i++) {
			
			int prod=0;
			String var=arr.get(i);
			System.out.println("var"+i+" "+var.length());
			if(var.length()>1) {
				String[] ind=var.split("");
				
				for(int j=0;j<ind.length;i++) {
					prod=prod*(Integer.parseInt(ind[j]));
				}
				System.out.println("product:"+prod);
				map.put(var, prod);
			}else {
				map.put(var, Integer.parseInt(var));
			}
		}
		
		for(String key:map.keySet()) {
			System.out.println("Key["+key+"] value ["+map.get(key)+"]");
			/*int val=map.get(key);
			for(String key1:map.keySet()) {
				if(val==map.get(key1)) {
					System.out.println("Not colorful");
				}
			}*/
		}
		

	}

}
