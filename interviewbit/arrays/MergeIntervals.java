package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Ans
//https://www.programcreek.com/2012/12/leetcode-merge-intervals/

class Interval {
	    int start;
	   int end;
	   Interval() { start = 0; end = 0; }
	   Interval(int s, int e) { start = s; end = e; }
}

public class MergeIntervals {

	public static void main(String[] args) {
		
		
		
		ArrayList<Interval> intervals =new ArrayList<Interval>();
		
		Interval in=new Interval(1,3);
		Interval in1=new Interval(1,9);
		Interval in2=new Interval(2,5);
		intervals.add(in);
		intervals.add(in1);
		intervals.add(in2);
		
		ArrayList<Interval> result = new ArrayList<Interval>();
		 
	    /*if(intervals==null||intervals.size()==0)
	        return result;
	 */
	    Collections.sort(intervals, new Comparator<Interval>(){
	        public int compare(Interval i1, Interval i2){
	            if(i1.start!=i2.start)
	                return i1.start-i2.start;
	            else
	                return i1.end-i2.end;
	        }
	    });
	    
	    for(int i=0;i<intervals.size();i++) {
	    	Interval obj=intervals.get(i);
	    	System.out.println("start"+obj.start);
	    	System.out.println("end"+obj.end);
	    	System.out.println();
	    }
	    
	 
	    Interval pre = intervals.get(0);
	    for(int i=0; i<intervals.size(); i++){
	        Interval curr = intervals.get(i);
	        if(curr.start>pre.end){
	            result.add(pre);
	            pre = curr;
	        }else{
	            Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
	            pre = merged;
	        }
	    }
	    result.add(pre);

	}

}
