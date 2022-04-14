package com.training.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
//Car car1 = new Car();
//car1.getValues();

Vehicle car2 = new Car(); // Parent class reference can point to child class object
System.out.println(car2.getTopSpeed()); // getTopSpeed has to be in vehicle in order to compile
//dynamic polymorphism
}

}
