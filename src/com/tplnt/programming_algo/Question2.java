package com.tplnt.programming_algo;

public class Question2 {
	
	/**
	 * Write a program to create a staircase. The function takes an integer argument N as the height of the staircase and prints a staircase.
	 * @param num an integer
	 * @return nothing
	 */
	public static void stairCasePrinter(int num) {

	    if (num < 1) {
	        return;
	    }
	    else {
	        String currentNoOfStairCase = "";
	        for (int i = 1; i <= num; i++) {
	            currentNoOfStairCase += "#";
	            System.out.println(currentNoOfStairCase);
	        }
	    }

	}
	
	public static void main(String...args) {
		stairCasePrinter(6);
	}

}
