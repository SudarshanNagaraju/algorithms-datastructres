package com.sixdee.test.interviewbit.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
	
		
		List<Long> A=new ArrayList<Long>();
		
		A.add(3l);
		A.add(30l);
		A.add(34l);
		A.add(5l);
		A.add(9l);
		ArrayList<String> strlist=new ArrayList<String>();
		
		
		
		StringBuffer str=new StringBuffer();
		
		for(int i=0;i<A.size();i++) {
			strlist.add(A.get(i)+"");
		}
		/*
		
		java.util.Collections.sort(strlist);
		
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		for(int k=0;k<strlist.size();k++) {
			
			//System.out.print(" "+strlist.get(k));
			
			
			map.put(k, strlist.get(k));
		}
		
		for(Integer key:map.keySet()) {
	        System.out.print(" "+map.get(key));
	        }
		
		
		int k=0;
        while(k<strlist.size()-1){
			
        	String x=map.get(k);
        	String y=map.get(k+1);
			
        	Long xy=Long.parseLong(x+y);
        	Long yx=Long.parseLong(y+x);
        	if(xy>yx) {
        		map.put(k, y+"");
        		map.put(k+1, x+"");
        	}
        	k++;
		}

        strlist=new ArrayList<String>();
        //System.out.println("FInal list");
        for(Integer key:map.keySet()) {
        //System.out.print(" "+map.get(key));
        strlist.add(map.get(key));
        }
        int n=strlist.size();
        
        for(int l=n-1;l>=0;l--) {
        	str.append(strlist.get(l));
        }
        
        BigInteger blow = new BigInteger(str.toString());
        if(blow.compareTo(BigInteger.ONE) != 0) {
        	
        }
		
        System.out.println("Final"+str.toString());

	}
*/
	/*	Collections.sort(strlist, new Comparator<String>(){

			// A comparison function which is used by 
			// sort() in printLargest()
			@Override
			public int compare(String X, String Y) {
			
			// first append Y at the end of X
			String XY=X + Y;
			
			// then append X at the end of Y
			String YX=Y + X;
			
			// Now see which of the two formed numbers 
			// is greater
			return XY.compareTo(YX) > 0 ? -1:1;
		}
		});	
		
		
		Iterator it = strlist.iterator();

		while(it.hasNext())
			System.out.print(" "+it.next());
		*/
		String fin="0000000";
		
		
		String[] check=fin.split("");
		System.out.println(""+check[0]);
        if(!check[0].equals("0")) {
        	System.out.println("Not zero");		
        	
        }else{
            System.out.println("Zero");
        }
		
		
		
	}
}
