package com.h2kinfosys.learn.dayThree;

public class ForEachLoop {

	public static void main(String[] args) {
		int marks[] = {79,80,90,89,87,97};
		int max_length = marks.length - 1;
		int totalMarks = 0;
		for(int i=0; i <= max_length; i++) {
			totalMarks = totalMarks + marks[i];
			
		}
        System.out.println("Total Marks : " + totalMarks);
        
        totalMarks = 0;
		for(int eachSubMarks : marks) {
			totalMarks = totalMarks + eachSubMarks;
			
		}
        System.out.println("For Each Total Marks : " + totalMarks);
        
        
	}

}
