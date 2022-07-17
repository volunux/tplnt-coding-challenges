package com.tplnt.programming_algo;

import java.util.Arrays;

public class Question3 {

	/**
	 * <pre>
	 * Given a multidimensional array, write a program to remove duplicates from each row of the n-dimensional 
	 * array without using any in-built language functions i.e. you are expected to write your own logic entirely for this solution.
	 * For every duplicate found per row, replace the duplicates with the number 0.
	 * </pre>
	 * @param arr multidimensional array of Integers
	 * @return multidimensional array of integers
	 */
	public static Integer[][] integerDuplicateFinder(Integer[][] arr) {
	    if (arr.length < 1) {
	        return new Integer[][] {};
	    }
	    else {
	        for (int i = 0; i < arr.length; i++) {
	        	Integer[][] newArr = new Integer[2][];
	        	newArr[i] = new Integer[arr[i].length];
	        	Integer[] currentArr = arr[i];
	        	for (int j = 0; j < currentArr.length; j++) {
	                newArr[i][j] = Arrays.asList(newArr[i]).indexOf((Object) currentArr[j]) == -1 ? currentArr[j] : 0; 
	        	}
	        	arr[i] = newArr[i];
	        }
	    }
	    return arr;
	}
	
	public static void main(String...args) {
		Integer[][] sampleInput = new Integer[][]{{1, 3, 1, 2, 3, 4, 4, 3, 5}, {1, 1, 1, 1, 1, 1, 1}};
		System.out.println(Arrays.deepToString(integerDuplicateFinder(sampleInput)));
	}
}
