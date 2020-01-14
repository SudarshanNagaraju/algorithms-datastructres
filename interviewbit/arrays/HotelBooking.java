package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class HotelBooking {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrive=new ArrayList<Integer>();
		
		
		arrive.add(1);
		arrive.add(3);
		arrive.add(5);
		ArrayList<Integer> depart=new ArrayList<Integer>();
		
		
		depart.add(2);
		depart.add(6);
		depart.add(8);
		
		int K=1;
		
		
		 ArrayList<Integer> newList = new ArrayList<>();
	        HashMap<Integer, Integer> arrival = new HashMap<>();
	        HashMap<Integer, Integer> departure = new HashMap<>();
	        int temp = -1;
	        for(int x : arrive){
	            if(!newList.contains(x)){
	                newList.add(x);
	            }
	            
	            if(arrival.containsKey(x)){
	                temp = arrival.get(x);
	                arrival.put(x, temp+1);
	            }else{
	                arrival.put(x, 1);
	            }
	        }
	        for(int x : depart){
	            if(!newList.contains(x)){
	                newList.add(x);
	            }
	            if(departure.containsKey(x)){
	                temp = departure.get(x);
	                departure.put(x, temp+1);
	            }else{
	                departure.put(x, 1);
	            }
	        }
	        Collections.sort(newList, new Comparator<Integer>(){
	             @Override
	                 public int compare(Integer o1, Integer o2) {
	                     return o1>o2 ? 1 : -1;
	                 }
	             });
	         int count = 0;
	         for(int p : newList){
	             
	             if(K<0){
	                 break;
	             }
	             if(departure.containsKey(p)){
	                 K+= departure.get(p);
	             }
	             if(arrival.containsKey(p)){
	                 K-= arrival.get(p);
	             }
	         }
	        if(K>=0){
	            System.out.println("True");
	        }else{
	            System.out.println("False");
	        }
	     
		

	}

}
