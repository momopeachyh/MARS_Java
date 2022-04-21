package com.training.mars;

public class MyClass {
	public static void main(String args[]) throws MyException {
		System.out.println("This is the first Java file");
		
		byte byteValue = 12;
		System.out.println("byte value is " + byteValue);	
		short shortValue = 48;
		int intValue = 89;
//		byte newByte = intValue;
//		Doesn't work bcs int (4 bytes) can't be converted to byte (1 byte)
		
//		Typecasting:
		byte newByte = (byte)intValue;
		System.out.println("intValue = " + intValue);
		
		
//		Possible without explicit typecast bcs short value has less memory than int
//		This is implicit typecasting
		int newInt = shortValue; 	
		
		int charValue = 'a';
//		prints 97 to console. Java converts 'a' into integer code
		
		Person p1 = new Person();
		p1.setHeight(170);
		p1.setWeight(80);
//		before getter/setter methods added, it was p1.weight = 80;
		System.out.println(p1.getPersonInfo());
		
		Person p2 = new Person();
		p2.setHeight(180);
		p2.setWeight(90);
		System.out.println(p2.getPersonInfo());
		
		if(p1.getWeight() > 75) {
			throw new MyException("Weight over 75");
		}
		
	int num1 = 8;
	int result = 0;
	String str = null;
	
	try {
	result = num1/0; //runtime exception. Thrown at runtime
//	System.out.println(str.length());  //this line isn't even executed since line 42 is an exception
	}
//	try {
//		System.out.println(str.length());
//	}
	catch(ArithmeticException e) {
		System.out.println("cannot divide by zero.");
		System.out.println("message is: " + e.getMessage());
		e.printStackTrace(); //another way to show an exception message
	}
	catch(NullPointerException e) {
		System.out.println("String cannot be null.");
	}
	System.out.println("result is "+ result);
	
	double salary = 5000;

	}
}
