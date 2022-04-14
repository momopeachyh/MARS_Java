package com.training.inheritance;

public class Car extends Vehicle{
//	Static int noOfWheels;
	
	public Car() {
//		super(); this is actually invoked but not written explicitly
		System.out.println("Car constructor");
	}
	public void getValues() {
		brakeType = "disc";
		speed = 150;
		color = "blue";
		System.out.println("Color: " + color + " Speed: " + speed);
		getTopSpeed();
	}
	@Override
	public int getTopSpeed() {
		return 200;
	}
}
