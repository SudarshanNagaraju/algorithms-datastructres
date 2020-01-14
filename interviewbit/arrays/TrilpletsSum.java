package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class TrilpletsSum {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> A=new ArrayList<String>();
		
		
		A.add("0.6");
		A.add("0.7");
		A.add("0.8");
		A.add("1.2");
		A.add("0.4");
		
		
		Double num1=Double.parseDouble(A.get(0));
		Double num2=Double.parseDouble(A.get(1));
		Double num3=Double.parseDouble(A.get(2));
		
		
		
		for(int i=3;i<A.size();i++) {
			
			
			if(num1+num2+num3>1 && num1+num2+num3<2) {
				System.out.println("True");
			}else if(num1+num2+num3>2){
			
				if(num1>num2 && num1>num3) {
					num1=Double.parseDouble(A.get(i));
				}else if(num2>num3) {
					num2=Double.parseDouble(A.get(i));
				}else {
					num3=Double.parseDouble(A.get(i));
				}
				
			}else{
				
				if(num1<num2 && num1<num3) {
					num1=Double.parseDouble(A.get(i));
				}else if(num2<num3) {
					num2=Double.parseDouble(A.get(i));
				}else {
					num3=Double.parseDouble(A.get(i));
				}
				
				
			}
			
			
		}
		
		
		if((num1+num2+num3)>1 && (num1+num2+num3)<2) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
		

	}

}
