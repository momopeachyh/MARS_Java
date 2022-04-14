package com.training.mars;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
//		get year
		System.out.println("Enter a year.");
		int year = scanner.nextInt();
//		System.out.println(year);
		
//		get month (number)
		System.out.println("Enter a month by its number.");
		int month = scanner.nextInt();
		
//		Get number of days in the month and print
		YearMonth yearMonth = YearMonth.of(year, month);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
		System.out.println("There are " + yearMonth.lengthOfMonth() + " days in " + formatter.format(yearMonth));
	   }

}
