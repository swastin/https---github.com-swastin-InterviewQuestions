package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class problem9 {
    public static void main(String[] args) {
        IntStream intstream = IntStream.of(1, -2, 3, 4, 5);
        String commaSeparatedString = intstream.mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(commaSeparatedString);
    }
}