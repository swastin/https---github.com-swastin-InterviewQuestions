package com.programingquestions.JavaEight.IntegerRelatedProblems;

import java.util.Scanner;
import java.util.stream.IntStream;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter startingpoint");
        int source = sc.nextInt();
        System.out.println("Enter end point");
        int dest = sc.nextInt();
        IntStream intstream = IntStream.rangeClosed(source, dest);
        // System.out.println(Arrays.toString(intstream.toArray()));

        intstream.filter(problem7::isPrime).forEach(System.out::println);

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
