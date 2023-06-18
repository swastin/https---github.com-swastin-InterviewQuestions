package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Arrays;

/**
 * Implement a program to filter out the even
 * numbers from an integer array using Java 8 streams
 * 
 */
public class problem2 {
    public static void main(String[] args) {
        int arr[] = { 20, 15, 5, 4, 26,8,10,12,15,25,35 };
        int even[] = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
for (int i : even) {
	System.out.println(i);
}
    }
}
