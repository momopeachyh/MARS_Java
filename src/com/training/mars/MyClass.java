package com.training.mars;

public class MyClass {
	public static void main(String args[] ){
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
	
		
		
	}
}
