package com.training.mars;

import java.util.*;

public class StackPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the desired number of inputs.");
		
		int arrayLength = scanner.nextInt();
		int [] array = new int[arrayLength];
		
		System.out.println("Enter that many numbers.");
		
	
		
	    for(int i=0; i<array.length; i++ ) {
	         array[i] = scanner.nextInt();
	      }
	    
	    System.out.println("These are the numbers you entered: " + Arrays.toString(array));

		Arrays.sort(array);	
	    System.out.println("Here are those numbers in ascending order: " + Arrays.toString(array));

	}

}
