package com.training.mars;
import java.util.Scanner;

public class Date2ndTry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int monthLengths [] = {
				0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		
		int daysNo;
		
		String months[] = {
				"null",
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		
//		Get year
		System.out.println("Enter a year.");
		int year = scanner.nextInt();
		
//		Get month number
		System.out.println("Enter a month (by its number)");
		int monthNo = scanner.nextInt();
		
//		If month out of range is entered . . .
		while (monthNo < 1 || monthNo > 12) {
			System.out.println("Please enter a number between 1 and 12.");
			monthNo = scanner.nextInt();
		}
		
//		Check for leap year and show output
		if (monthNo != 2) {
			daysNo = monthLengths[monthNo];
			System.out.println(months[monthNo] + " of " + year + " has this many days: " + daysNo);
		} else if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				daysNo = monthLengths[monthNo];
				System.out.println(months[monthNo] + " of " + year + " has this many days: " + daysNo);
			} else {
				daysNo = 29;
				System.out.println(months[monthNo] + " of " + year + " has this many days: " + daysNo);
			}
		}
		
	}
}


