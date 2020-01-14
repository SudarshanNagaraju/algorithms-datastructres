package com.sixdee.test.interviewbit.arrays;

public class minstepsininfinitegrid {

	int MAX(int x, int y) 
	{
	    return (x > y) ? x : y;
	}
	    
	    public int coverPoints(int[] X, int[] Y) {
	        int len = 0;
	    int i;
	    int startx, starty;
	    int n1=X.length;
	    
	    if (n1 == 0) return 0;
	    
	    if (n1 == 1) return 0;
	    
	    startx = X[0];
	    starty = Y[0];
	    for (i = 1; i < n1; i++) {
	        int x = Math.abs(startx - X[i]);
	        int y = Math.abs(starty - Y[i]);
	        startx = X[i];
	        starty = Y[i];
	        
	        len += MAX(x,y);
	    }
	    
	    return len;
	    }

}
