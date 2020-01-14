package com.sixdee.test.interviewbit.strings;

public class MinimumCharReqtoMakePalindrome {

	static int[] computeLPSArray(String s)
	{
	    int n = s.length();
	    //Initializing LPS vector
	    int[] LPS=new int[n];
	 
	    LPS[0] = 0; 
	 
	    // from i to n-1
	    int i = 1;
	    int len = 0;
	    while (i < n)
	    {
	        if (s.charAt(i) == s.charAt(len))
	        {
	            len++;
	            LPS[i] = len;
	            i++;
	        }
	        else // (s[i] != s[len])
	        {
	            if (len != 0)
	            {
	                len = LPS[len-1];
	            }
	            else // if (len == 0)
	            {
	                LPS[i] = 0;
	                i++;
	            }
	        }
	    }
	    return LPS;
	}
	 
	
	static int minCharRequired(String s)
	{
	    String rs ="";
	    //reverse of the string
	    for(int i=s.length()-1;i>=0;i--) {
	    rs=rs+s.charAt(i);
	    }
	    // Get concatenation of string, special character
	    // and reverse string
	    
	    System.out.println("rs"+rs);
	    String c = s + "$" + rs;
	 
	    // Build LPS arrat
	    int[] LPS = computeLPSArray(c);
	 
	    // Length - last value
	    return (s.length() - LPS[LPS.length-1]);
	}
	 
	
	public static void main(String[] args) {
		
		 String str = "banana";
	        System.out.println(
	        		minCharRequired(str));
		
		

	}

}
