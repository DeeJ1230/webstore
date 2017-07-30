package com.packt.webstore.domain;

public class Customer {
	private String customerId;
	private String name;
	private String address;
	private int numberOfOrdersMade;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberOfOrdersMade() {
		return numberOfOrdersMade;
	}
	public void setNumberOfOrdersMade(int numberOfOrdersMade) {
		this.numberOfOrdersMade = numberOfOrdersMade;
	}
}
