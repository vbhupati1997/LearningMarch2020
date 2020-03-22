package com.h2kinfosys.learn.dayThree;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		int iterator = 0;
		int total = 0;
		do {
			total = total + iterator;
			iterator++;
		}while(iterator <= 10);
		System.out.println("iterator : " + iterator);
		System.out.println("total : " + total);

	}

}
