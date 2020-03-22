package com.h2kinfosys.learn.dayTwo;

public class Customer {
	int customerId;
	String customerName;
	int age;
	char gender;
	static String storeName = "BEST BUY";

	public static void main(String[] args) {
		Customer custOne = new Customer();
		custOne.customerId = 100;
		custOne.customerName = "DAVID";
		custOne.age = 70;
		custOne.gender = 'M';
		Customer custTwo = new Customer();
		custTwo.customerName = "JIM";
		System.out.println("custOne.customerName : " + custOne.customerName);
		System.out.println("custTwo.customerName : " + custTwo.customerName);
		System.out.println("storeName : " + storeName);
		

	}

}
