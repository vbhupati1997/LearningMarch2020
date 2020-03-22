package com.h2kinfosys.learn.dayTwo;

public class LogicalOperators {
	public static void main(String[] args) {
		int firstVar = 200;
		int secondVar = 100;
		int thirdVar = 1000;
		//Comparison Operators - leads boolean result
		System.out.println("Equals : " + (firstVar == secondVar));
		System.out.println("Not Equal : " + (firstVar != secondVar));
		System.out.println("Greater than Equal to : " + (firstVar >= secondVar));
		System.out.println("Greater than : " + (firstVar > secondVar));
		System.out.println("Less than Equal to : " + (firstVar <= secondVar));
		System.out.println("Less than : " + (firstVar < secondVar));
		
		//Strings are compared with equals
		String firstName = "David";
		String lastName = "david";
		boolean result = firstName.equalsIgnoreCase(lastName);
		System.out.println("result : " + result);
		boolean resultAnd = ((firstVar > secondVar) && (secondVar > thirdVar));
		System.out.println("resultAnd : " + resultAnd );
		boolean resultOr = ((firstVar > secondVar) || (secondVar > thirdVar));
		System.out.println("resultOr : " + resultOr );
		boolean testVar = true;
		System.out.println("testVar : " + !testVar );
		
		
	}

}
