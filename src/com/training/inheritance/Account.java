package com.training.inheritance;

// If one method in a class is abstract, the entire class becomes abstract
public abstract class Account {

	public abstract double getBalanceAmount();
	
//	concrete method in abstract class
	public String accountType() {
		return "Savings";
	}
	
}
