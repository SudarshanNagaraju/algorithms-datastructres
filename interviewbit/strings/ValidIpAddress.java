package com.sixdee.test.interviewbit.strings;

import java.util.ArrayList;

public class ValidIpAddress {

	public static void main(String[] args) {
		String number = "25525511135";
		int l = number.length() - 3;
		ArrayList<String> list=new ArrayList<String>();
		for(int a = 0; a < l; a++) {
		    for(int b = 0; b < l-a; b++){
		        for(int c = 0; c <l-a-b; c++){
		            StringBuilder sb = new StringBuilder(number);
		            sb.insert(a+1, ".");
		            sb.insert(a+b+3, ".");
		            sb.insert(a+b+c+5, ".");
		            System.out.println(sb);
		            list.add(sb.toString());
		        }
		    }
		}

	}

}
