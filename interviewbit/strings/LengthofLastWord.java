package com.sixdee.test.interviewbit.strings;

public class LengthofLastWord {

	public static void main(String[] args) {
		
		
		String A="the sky is blue";
		
		
		/*if(A.trim().length()==0) {
			//return 0;
		}
		String[] arr=new String[A.length()];
		try {
         arr=A.split(" ");
         
        
        //return arr[1].length();
        }catch(ArrayIndexOutOfBoundsException e) {
         //return 
        	arr[0].length();   
        }*/
		
		
		
		
		String[] arr=new String[A.length()];
		
		arr=A.trim().split(" ");
		
		StringBuffer str=new StringBuffer();
		for(int i=arr.length-1;i>=0;i--) {
			str.append(arr[i]);
			str.append(" ");
			
			
		}
		
		
		System.out.println("Last:"+str.toString());
		
		

	}

}
