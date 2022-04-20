package com.training.java8;

public class LambdaDemo {

	public static void main(String[] args) {
	MyFuncInterface method = (int a, int b) -> System.out.println("Demo: " + (a+b));
	method.getValue(2, 3);
	}

}
