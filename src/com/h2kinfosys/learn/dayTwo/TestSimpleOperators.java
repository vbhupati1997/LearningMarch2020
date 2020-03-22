package com.h2kinfosys.learn.dayTwo;

public class TestSimpleOperators {

	public static void main(String[] args) {
		int firstVar = 200;
		int secondVar = 100;
		System.out.println("Addition : " + (firstVar + secondVar));
		System.out.println("Subtraction : " + (firstVar - secondVar));
		System.out.println("Multiplication : " + (firstVar * secondVar));
		System.out.println("Division : " + (firstVar / secondVar));
		System.out.println("Modulus : " + (firstVar % secondVar));
		//Increment - use and increase
		System.out.println("Increment - use and increase : " + firstVar++); 
		//Increment - increase and use
		System.out.println("Increment - increase and use : " + ++firstVar);
	}

}
