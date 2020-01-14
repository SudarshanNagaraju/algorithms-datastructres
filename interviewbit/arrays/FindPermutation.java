package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Stack;

public class FindPermutation {

	public static void main(String[] argA) {
	
		
		String A="";
		
		int[] res = new int[A.length() + 1];
        Stack < Integer > stack = new Stack < > ();
        int j = 0;
        for (int i = 1; i <= A.length(); i++) {
            if (A.charAt(i - 1) == 'I') {
                stack.push(i);
                while (!stack.isEmpty())
                    res[j++] = stack.pop();
            } else {
                stack.push(i);
            }
        }
        stack.push(A.length() + 1);
        while (!stack.isEmpty())
            res[j++] = stack.pop();
        //return res;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<res.length;i++) {
        	list.add(res[i]);
        }

	}

}
