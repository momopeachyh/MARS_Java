package com.training.mars;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter age");
		
		int luckyNo = scanner.nextInt();
		
		if (luckyNo == 30) {
			System.out.println("good job");
		} else {
			System.out.println("try again");
		}

	}

}
