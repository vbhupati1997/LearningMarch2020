package com.h2kinfosys.learn.dayThree;

public class ForLoopTest {

	public static void main(String[] args) {
		int total = 0;
		for (int iterator = 1; iterator <= 10; iterator++) {
			total = total + iterator;
		}
        System.out.println("total : " + total);
	}

}
