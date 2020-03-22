package com.h2kinfosys.learn.dayThree;

public class WhileLoopTest {

	public static void main(String[] args) {
		int total = 0;
		int iterator = 0;
		while (iterator <= 10) {
			total = total + iterator;
			iterator++;
			
		}
		System.out.println("Iterator : " + iterator);
		System.out.println("Total : " + total);
	}

}
