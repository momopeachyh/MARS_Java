package com.training.inheritance;

public class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle constructor");
	}
	
	String brakeType;
	String color;
	String make;
	String model;
	int year;
	int speed = 140;
	
//	methods
	public int getTopSpeed() {
		return speed;
	}
	
	
}
