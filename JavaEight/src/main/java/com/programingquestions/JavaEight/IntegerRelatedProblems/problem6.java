package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Arrays;
import java.util.List;

public class problem6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Double> fp_num = Arrays.asList(1.2, 2.5, 5.6, 6.7,6.78,6.789);
        Double max = fp_num.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
        System.out.println(max);
    }
}
