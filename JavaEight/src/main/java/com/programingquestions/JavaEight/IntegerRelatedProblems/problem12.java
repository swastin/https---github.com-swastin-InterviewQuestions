package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.stream.IntStream;

public class problem12 {
    public static void main(String[] args) {

        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7).filter(n -> n > 0)
                .map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
