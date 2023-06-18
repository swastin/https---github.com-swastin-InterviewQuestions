package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.stream.IntStream;

public class problem10 {
    public static void main(String[] args) {
        int product = IntStream.of(1, -2, 3, 4, 5).reduce(1, (x, y) -> x * y);
        System.out.println(product);
    }

}
