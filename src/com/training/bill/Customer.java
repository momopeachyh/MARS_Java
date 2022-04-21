package com.training.bill;

public class Customer {
	
	private String cust_id;
	private String cust_name;
	private int unit_consumption;
	
	public Customer(String cust_id, String cust_name, int unit_consumption) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.unit_consumption = unit_consumption;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getUnit_consumption() {
		return unit_consumption;
	}
	public void setUnit_consumption(int unit_consumption) {
		this.unit_consumption = unit_consumption;
	}
	
	public String getCustInfo() {
	return cust_id + "," + cust_name + "," + unit_consumption;
	}

}
