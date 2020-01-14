package com.sixdee.test.datastructures.string;

public class MaxOccuringCharacter {

	
	static int spceCount=0;
	int[] findCount(String str){
		
		
		int[] arr=new int[256];
		
		
		for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(c==' ') {
			spceCount++;
		}else {
			arr[str.charAt(i)]++;
		}
		}
		
		
		
		return arr;
		
	}
	
	
	
	
	public static void main(String[] args) {

		
		
		String str="aaample str ing";
		
		
		
		MaxOccuringCharacter obj=new MaxOccuringCharacter();
		int[] arr=new int[256];
		arr=obj.findCount(str);
		
		int max=-1;
		Character ch=' ';
		
		for(int i=0;i<str.length();i++) {
			
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
			
		}
		
		
		System.out.println("Max Count:"+max+"Character:"+ch+"space count:"+spceCount);
		
		
		
		
		
		
	}

}
