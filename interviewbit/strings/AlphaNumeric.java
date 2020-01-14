package com.sixdee.test.interviewbit.strings;

public class AlphaNumeric {

	public static void main(String[] args) {
		
		String str="A man, a plan, a canal: Panama";
		
		str=str.replaceAll("[:&%$#@!~ ,^]", "");
		//System.out.println("String"+str.replaceAll("[:&%$#@!~ ,^]", ""));
		
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			
			String leftStr=Character.toString(str.charAt(left));
			String rightStr=Character.toString(str.charAt(right));
			
			if(!leftStr.equalsIgnoreCase(rightStr)){
				System.out.println("Not palindrome");
			}
			left++;
			right--;
			
		}
		
		System.out.println("palindrome");

	}

}
