package com.sixdee.test.Adobe;

public class StringRotations {

	
	public int checkRotation(String str) {
       char arr[]=str.toCharArray();
		
		StringBuffer buffer=new StringBuffer();
		
		
		int k=0;
		for(int j=0;j<arr.length;j++) {
		k=j;
		for(int i=j+1;i<arr.length;i++) {
			buffer.append(arr[i]);
		}
		int l=0;
		while(l<=k) {
		buffer.append(arr[l]);
		l++;
		}
		
		//System.out.println("k:"+k+" string:"+buffer.toString());
		
		if(buffer.toString().equalsIgnoreCase(str)) {
			return 1;
		}
		
		buffer=new StringBuffer();
		
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		String str="forgeeksgeeks";
		
		StringRotations obj=new StringRotations();
		
		System.out.println("String is roatation:"+obj.checkRotation(str));
		
		

	}

}
