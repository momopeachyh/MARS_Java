package com.training.bill;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import com.training.bill.Customer;
import com.training.mars.MyException;
import com.training.mars.Person;

public class BillCalculator {

	public static void main(String[] args) throws MinimumException {
		
//		attempt to make customer array dynamic
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the desired number of bills to generate.");
//		int arrayLength = scanner.nextInt();
		
//		
//		while(customer.length < arrayLength ) {
//			 customer[i] = new Customer();
//			 System.out.println("Enter a customer id.");
//			 String id = scanner.next();
//			 customer[i].setCust_id(id);
//		}
//		 for(int i=0; i<customer.length; i++ ) {
//			 Person p1 = new Person();		
					
//     }
		
		int arrayLength;
		arrayLength = 5;
		Customer customer[] = new Customer[arrayLength];
		
		customer[0] = new Customer("101", "Doreen Carwithen", 150);
		customer[1] = new Customer("102", "John Adams", 25);
		customer[2] = new Customer("103", "Tomeka Reid", 1201);
		customer[3] = new Customer("104", "Hans Zimmer", 700);
		customer[4] = new Customer("105", "Jennifer Higdon", 230);
	
//		why double and not int?
		double billTotal;
		double bills [] = new double[arrayLength];
		
		final DecimalFormat df = new DecimalFormat("0.00");

		for(int i=0; i<customer.length; i++) {
			System.out.println(customer[i].getCustInfo());
//			if usage > 1000 units
			if(customer[i].getUnit_consumption() > 1000) {
				billTotal = ((customer[i].getUnit_consumption() - 200) * .75 + 50);
				System.out.println(df.format(billTotal));
				bills[i] = billTotal;
//				if 500 < usage < 1000
				} else if (customer[i].getUnit_consumption() <= 1000 && customer[i].getUnit_consumption() > 500){
				billTotal = (customer[i].getUnit_consumption() - 200) * 1 + 50;
				System.out.println(df.format(billTotal));
				bills[i] = billTotal;
//				if 200 < usage < 500
			} else if (customer[i].getUnit_consumption() <= 500 && customer[i].getUnit_consumption() > 200) {
				billTotal = (customer[i].getUnit_consumption() - 200) * 1.25 + 50;
				System.out.println(df.format(billTotal));
				bills[i] = billTotal;
//				if 50 < usage 200
			} else if(customer[i].getUnit_consumption() <= 200 && customer[i].getUnit_consumption() >= 50) {
				billTotal = 50;
				bills[i] = billTotal;
				System.out.println(df.format(billTotal));
			} else try {
				throw new MinimumException ("Unit consumption must be greater than 50.");
			}
			catch(MinimumException e) {
				System.out.println(e.getMessage());
			}
//			for line break
			System.out.println();
		}
		
	for(int i=0; i<bills.length; i++) {
		System.out.println(df.format(bills[i]));
	}
	
//	Problem Statement: 
//
//		Provide a code solution to calculate electricity bill payment for group of consumers based on the electric consumption over a period based on Java 9 code solution of array etc features. 
//
//		Description: National Electricity Corporation (NEC) charges monthly electricity charges based on consumption of its consumers. The rate of charge is as follows: 
//
//		Up to 200 units every consumer must pay flat an amount $50. 
//
//		From 201 to 500 units rate is $1.25/unit. 
//
//		From 501 to 1000 units’ rate is $1.00/unit. 
//
//		From 1001 units and above rate is $0.75/unit. 
//
//		Consumption unit must be in whole number. 
//
//		The computer operator of NEC normally accepts consumer’s details like consumer number, name, unit consumption in a comma(,) separate String to generate bill (eg: 653,Steve Jones,754). The operator normally generates bill for number of consumers at a time. So before starting operation, the operator asks for number of consumers’ bill to prepare. All bills are stored in an array. Finally display the contains of array, all decimal figures must show 2 decimal places. 
//
//		If number of Units is less than 50, the application should throw MinimumUnitsException and display a message “No of units can not be less than 50” 		
		
	}

}
