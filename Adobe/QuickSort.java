package com.sixdee.test.Adobe;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {

		
		Random random = new Random(System.nanoTime() % 100000);

		  int j=10;
		  while(j>0) {
			  int randomInt = random.nextInt(1000000000);
		  System.out.println("Random"+randomInt);
		  j--;
		  }
	}

}
