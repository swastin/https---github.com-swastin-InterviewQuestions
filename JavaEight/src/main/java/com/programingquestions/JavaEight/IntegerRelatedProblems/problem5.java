package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Arrays;

public class problem5 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 5, 3, 7, 4, 1, 2, 8, 6 };
        int uniqueArray[] = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueArray));
    }
}
