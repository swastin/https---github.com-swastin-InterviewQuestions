package com.programingquestions.JavaEight.MapRelatedProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapprogam2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, null);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        System.out.println("1.Using map.containsKey");

        if (map.containsKey(key)) {
            System.out.println("Key" + key + "is present in the map");
        }

        else {
            System.out.println("Key" + key + "is not present in the map");
        }

        // System.out.println("2.Using map.get and null check");

        // if (map.get(key) != null) {
        // System.out.println("Key" + key + "is present in the map");
        // }

        // else {
        // System.out.println("Key" + key + "is not present in the map");
        // }
        System.out.println("3.map.keySet().contains(key)\n----------------------------------");

        if (map.keySet().contains(key)) {
            System.out.println("Key" + key + "is present in the map");
        }

        else {
            System.out.println("Key" + key + "is not present in the map");
        }
        System.out.println(map.get(null));
    }
}
