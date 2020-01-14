package com.sixdee.test.Adobe;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		
		int num=1231;
		
		
		int rem=0;
		
		String newNum="";
		
		while(num>0) {
			
			rem=num%10;
			
			newNum=newNum+rem+"";
			num=num/10;
			
		}
		
		System.out.println(""+newNum);
		
		

	}

}
