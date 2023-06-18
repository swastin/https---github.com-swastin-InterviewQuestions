package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.stream.IntStream;

public class problem8 {
    public static void main(String[] args) {

        System.out.println(IntStream.of(1, -2, 3, 4, 5).allMatch(x -> x > 0) ? "All matched" : "all not matched");

        // intStream.forEach(System.out::print);
    }
}
