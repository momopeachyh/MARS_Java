package com.training.mars;

public class DataTypesDemo {

	public static void main(String[] args) {
//String name = "John";  //Creating a string literal
//String firstName = new String("John"); //creating a string object
//String myName = "John";
//System.out.println(name.equals(myName)); //compares content.true.
//System.out.println(name == myName); //compares references. true.
//String secondName = new String("John");
//System.out.println(firstName.equals(secondName)); // same content, so true
//System.out.println(firstName == secondName); //different references, so false
//	
//int[] marks = new int[5];
//for (int i=0; i<marks.length; i++) {
//	marks[i] = 2 * i + 40;
//}
//	for (int i=0; i<marks.length; i++) {
//		System.out.println(marks[i]);
//	}
	
	
//int [] numbers = {2, 1, 5, 4, 9, 7, 5, 0, 3, 6, 8, 1, 5};
//System.out.println(numbers[7]);
//
//for (int i=0; i<numbers.length; i++ ) {
//	System.out.println(numbers + "hi");
//}

int [][] nos = new int[3][];
nos[0] = new int[4];
nos[1] = new int[5];
nos[2] = new int[4];

for(int i=0; i<nos.length; i++) {
	for (int j=0; j<nos[i].length; j++ ) {
		nos[i][j] = i * 4 +j;
	}
}

for(int i=0; i<nos.length; i++) {
	for (int j=0; j<nos[i].length; j++ ) {
		System.out.println(nos[i][j]);
	}
	System.out.println();
}
	}

}
