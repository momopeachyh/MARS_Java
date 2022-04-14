package com.training.mars;

public class Person {
	
//	Eclipse makes this constructor automatically
//	public Person() {
//}
	
	
//	no-arg constructor
	public Person() {
		super();
	}
	
	
//	constructor with fields
	public Person (int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
//	instance variables
	private int height;
	private int weight;
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//	instance method
	public String getPersonInfo() {
		return "Person's height is " + height + " and weight is " + weight;
	}
	
}
