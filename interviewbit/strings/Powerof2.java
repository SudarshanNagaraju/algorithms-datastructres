package com.sixdee.test.interviewbit.strings;

import java.math.BigInteger;

public class Powerof2 {
	
	
	static boolean isPowerOfTwo(BigInteger n)
	    {
	        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE) )
	            return false;
	         
	        while (!n.equals(BigInteger.ONE))
	        {
	        	BigInteger val=new BigInteger("2");
	        	
	        	BigInteger check=n.mod(val);
	        	System.out.println("Remainder"+check);
	        	
	            if (!check.equals(BigInteger.ZERO))
	                return false;
	            
	            n = n.divide(val);
	        }
	        return true;
	    }
	 
	    // Driver program 
	    
	

	public static void main(String[] args) {
		
	
		String one="4";
		String two="3";
		
		BigInteger num1=new BigInteger(one);
		BigInteger num2=new BigInteger(two);
		
		System.out.println("Product"+String.valueOf(num1.multiply(num2)));
      /*BigInteger num=new BigInteger(A);
        
        BigInteger val=new BigInteger("2");
        
        BigInteger rem=new BigInteger(A);
        while(!rem.equals(1) && rem.divide(val).equals(0)) {
        	
        	rem=num.remainder(val);
        	
        	if(rem.equals(1)) {
        		System.out.println("Not power of 2");
        	}else if(rem.equals(0)) {
        		System.out.println("power of 2");
        	}
        	
        }
		*/

	}

}
