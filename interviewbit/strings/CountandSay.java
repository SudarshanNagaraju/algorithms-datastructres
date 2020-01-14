package com.sixdee.test.interviewbit.strings;

import java.util.HashMap;

public class CountandSay {

	public static void main(String[] args) {
		
		
		int first=1;
		
		HashMap<String, String> map=new HashMap<String,String>();
		
		
		
		int n=5;
		for(int i=0;i<n;i++) {
		if(i==0) {	
			
			map.put(String.valueOf((i+1)), "1");
			
		}else {
			String keyMap=String.valueOf(i);
			
			String[] val=new String[map.get((i)+"").length()];
			
			if(map.get(keyMap).length()>1) {
			val=map.get(keyMap).split("");
			}else {
				//System.out.println("map"+map.get(keyMap));
				val[0]=map.get(keyMap);
			}
		
		String key=val[0];
		int count=1;
		StringBuffer str=new StringBuffer();
		if(val.length==1) {
			str.append(count);
			str.append(key);
		}
		count=0;
		for(int j=0;j<val.length;j++) {
			if(!key.equalsIgnoreCase(val[j])) {
			str.append(count);
			str.append(key);
			count=0;
			key=val[j];
			count=count+1;
			}else {
				count=count+1;
			}
		}
		
		if(val.length!=1) {
			str.append(count);
			str.append(key);
		}
		
		//System.out.println("Key:"+(i+1)+"String:"+str.toString());
		map.put((i+1)+"",str.toString());
		}
			
		}
		
		

	}

}
