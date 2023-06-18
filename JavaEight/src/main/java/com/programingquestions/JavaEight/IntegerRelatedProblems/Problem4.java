package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Arrays;
import java.util.List;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Double> fp_num=Arrays.asList(1.2,2.5,5.6,6.7);
Double avg=fp_num.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
System.out.println(avg);
	}

}
