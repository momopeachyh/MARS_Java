package com.training.mars;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luckyNo = 7;
		int count = 1;
	
		System.out.println("Guess a number between 1 and 10.");
		
		int guess = scanner.nextInt();
		
		while (guess != luckyNo) {
			count++;
			
			if (guess > luckyNo ) {
				System.out.println("Too high. Try again.");
				guess = scanner.nextInt();
			} else {
				System.out.println("Too low. Try again");
				guess = scanner.nextInt();
			}
//		System.out.println("Try again.");
//		guess = scanner.nextInt();
		
		}
		if (guess == luckyNo) {
			System.out.println("Good job. Number of tries: " + count);

		}

	}

}
