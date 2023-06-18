package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Arrays;

/**
 * Implement a Java program to find the sum of all elements
 * in an integer array using Java 8 streams
 * 
 * 
 * 
 */
public class Problem1 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 9, 7, 5, 3 };
		int SumOfAllElement = Arrays.stream(arr).sum();
		System.out.println(SumOfAllElement);

	}

}
