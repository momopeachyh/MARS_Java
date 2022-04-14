package com.training.mars;

import java.util.Scanner;
public class BasicsDemo {

	public static void main(String[] args) {
		
		pattern();
		pattern2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter age");
//		You type age in console and the console displays voting eligibility
		
		int age = scanner.nextInt();
//		this line allows you to enter the age; it stores your input into age variable
		
		if(age < 18) {
			System.out.println("not eligible to vote");
		} else {
			System.out.println("eligible to vote");
		}
		scanner.close();
	}
	
	private static void pattern() {
//		loop for number of lines
		for (int i = 1; i<=3; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	private static void pattern2() {
		int k=1;
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
	}

}

// 1. take input from user.
// 2. if it matches lucky number, print "you guessed it!" to console
// 3. else print "try again."
