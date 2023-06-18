package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implement a Java program to sort a list of integers
 * in descending order using Java 8 streams
 */
public class Problem3 {
    public static void main(String[] args) {

        List<Integer> sortedlist = Arrays.asList(15, 99, 7, 5, 13, 6, 5, 4, 2, 11).stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(sortedlist);

        /****************************************
         * using Arrays *
         * must use cls inorder to lambda work *
         ****************************************/

        Integer arr[] = { 15, 19, 7, 5, 13, 6, 5, 14, 2, 11 };
        Arrays.sort(arr, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(arr));

    }
}
