package com.sixdee.test.interviewbit.arrays;

import java.util.ArrayList;

//http://buttercola.blogspot.com/2014/08/leetcode-set-matrix-zeros.html

public class SetMatrixtoZeros {
	

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
 		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		
		list.add(1);
		
		a.add(list);
		list=new ArrayList<Integer>();
		
		list.add(1);
		a.add(list);
		
        list=new ArrayList<Integer>();
		
		list.add(1);
		a.add(list);
		
		
		list=a.get(0);
		System.out.println(" "+list.size());
		int[][] matrix= new int[list.size()][list.size()];
		
		
		
		for(int i=0;i<a.size();i++) {
			
			list=new ArrayList<Integer>();
			list=a.get(i);
			for(int j=0;j<list.size();j++) {
				matrix[i][j]=list.get(j);
			}
			
		}
		
        /*for(int i=0;i<a.size();i++) {
			for(int j=0;j<a.size();j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
			
		}*/
		
		
		
		
		if (matrix == null || matrix.length == 0) return;
        
        // get rows and columns of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
         
        // allocate two addtional space to store zeros
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
         
        // iterate the matrix and set the zero flags
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
         
        // set the corresponding row and columns of the original matrix as zeros
        for (int i = 0; i < m; i++) {
            if (row[i] == true) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (col[j] == true) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        StringBuffer buffer=new StringBuffer();
        
        for (int i = 0; i < matrix.length; i++) {
        	buffer.append("[");
            for (int j = 0; j < matrix.length; j++) {
              // System.out.print(" "+matrix[i][j]);
            	buffer.append(matrix[i][j]);
            	buffer.append(" ");
            }
            
            buffer.append("]");
            buffer.append(" ");
           // System.out.println();
        }
        
        System.out.println(buffer.toString());
        
         
		
	}

}
