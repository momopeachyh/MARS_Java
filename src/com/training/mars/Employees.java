package com.training.mars;

public class Employees {
	private char firstName;
	private char lastName;
	private int age;
	private boolean retired;
	public char getfirstName() {
		return firstName;
	}
	public void setFName(char firstName) {
		this.firstName = firstName;
	}
	public char getlastName() {
		return lastName;
	}
	public void setLName(char lastName) {
		lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	public String showEmployeeAge() {
//		return "the person's name is " + firstName + " " + lastName;
		return "age is " + age;
	
	}
}
