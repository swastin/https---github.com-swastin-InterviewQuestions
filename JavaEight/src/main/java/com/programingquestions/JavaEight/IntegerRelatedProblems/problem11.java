package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class problem11 {
    public static void main(String[] args) {
        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).allMatch(x -> x % 2 == 0) ? "true" : "false");
    }
}
