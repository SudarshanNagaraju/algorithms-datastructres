package com.sixdee.test.Adobe;

public class DecimaltoBinary {

	public static void main(String[] args) {
		
		
		//decimal to binary
		
		int n=11;
		int a=0;
		String newnum="";
		
		
		while(n>0) {
			
			a=n%2;
			
			newnum=a+""+newnum;
			
			n=n/2;
			
			
		}
		//System.out.println(newnum);
		
		//binary to decimal
		
		int bin=101;
		int num=0;
		int rem=0;
		int base=1;
		while(bin>0) {
			
			rem=bin%10;
			
			num=num+rem*base;
			
			base=base*2;
			
			bin=bin/10;
			
			
		}
		
		System.out.println(num);

	}

}
