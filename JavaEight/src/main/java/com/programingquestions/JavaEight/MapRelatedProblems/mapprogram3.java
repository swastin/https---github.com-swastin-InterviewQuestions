package com.programingquestions.JavaEight.MapRelatedProblems;

import java.util.*;

public class mapprogram3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("D", 4);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 1);
        Map<String, Integer> sortedMap = new TreeMap<String, Integer>(map);

        // Iterate over the sorted entries and print them
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " +
        entry.getValue());
        }
        // sort by value desending
        /**
         * 1. extract all the entries into a list
         * 2.sort the list
         * 3.display the map
         * 
         */
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        // Iterate over the sorted entries and print them
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        /* descending order */

        List<Map.Entry<String, Integer>> entryList1 = new ArrayList<>(map.entrySet());

        // Sort the list based on the values in descending order using a custom
        // comparator
        Collections.sort(entryList1, Collections.reverseOrder(Map.Entry.comparingByValue()));

        // Iterate over the sorted entries and print them
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
