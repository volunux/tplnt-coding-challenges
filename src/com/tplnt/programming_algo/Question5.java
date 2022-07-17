package com.tplnt.programming_algo;

import java.util.Scanner;

public class Question5 {

	/**
	 * Write a recursive function to find the sum of digits of a number.
	 * @param input String of digits
	 * @return total Sum of digits
	 */
	public static int totalSummerII(String input) {
	        String[] inputArr = input.split("");
	        int totalSum = 0;
	        for (int i = 0; i < inputArr.length; i++) {
	            totalSum += (Integer.parseInt(inputArr[i]));
	        }
	        return totalSum;
	}
	
	public static void main(String...args) {
		try (Scanner scanner = new Scanner(System.in)) {;
			// Sample inputs "1234445";
			String digits = scanner.next();
			System.out.println(totalSummerII(digits));
		}
	}
}
