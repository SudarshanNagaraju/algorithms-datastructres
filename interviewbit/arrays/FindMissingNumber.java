package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

public class FindMissingNumber {

	static int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               // increment count of non-positive 
               // integers
               j++;  
           }
        }
      
        return j;
    }
      
    /* Find the smallest positive missing 
       number in an array that contains
       all positive integers */
    static int findMissingPositive(int arr[], int size)
    {
      int i;
      
      // Mark arr[i] as visited by making 
      // arr[arr[i] - 1] negative. Note that 
      // 1 is subtracted because index start 
      // from 0 and positive numbers start from 1
      for(i = 0; i < size; i++)
      {
        if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
          arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
      }
      
      // Return the first index value at which 
      // is positive
      for(i = 0; i < size; i++)
        if (arr[i] > 0)
          return i+1;  // 1 is added becuase indexes 
                       // start from 0
      
      return size+1;
    }
      
    /* Find the smallest positive missing 
       number in an array that contains
       both positive and negative integers */
    static int findMissing(int arr[], int size)
    {
       // First separate positive and 
       // negative numbers
       int shift = segregate (arr, size);
       
       System.out.println("Shift Value"+shift);
       
       int arr2[] = new int[size-shift];
       int j=0;
       for(int i=shift;i<size;i++)
           {
               arr2[j] = arr[i];
               j++;
           }    
       // Shift the array and call 
       // findMissingPositive for
       // positive part
       
       System.out.println("j Value"+j);
       return findMissingPositive(arr2, j);
    }
    // main function
    public static void main (String[] args) 
    {
    	
    	ArrayList<Integer> lis=new ArrayList<Integer>();
    	lis.size();
    	
        int arr[] = {-8,-7,-6};
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is "+ 
                            missing);
    }
	
	
	/*public static void main(String[] args) {
		
		
		
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		A.add(3);
		A.add(4);
		A.add(-1);
		A.add(1);
		
		int[] a=new int[A.size()];
		int n=a.length;
		
		for(int i=0;i<A.size();i++) {
			a[i]=A.get(i);
		
		}
		int sum=0;
		int total=(n+1)*n/2;
		for(int i=0;i<A.size();i++) {
			if(a[i]>0) {
				sum=sum+a[i];
			}
			
		}
		
		System.out.println("Sum"+sum);
		System.out.println("Missing"+(total-sum));
		
		

	}
*/
}
