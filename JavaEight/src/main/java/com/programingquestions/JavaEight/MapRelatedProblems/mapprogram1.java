package com.programingquestions.JavaEight.MapRelatedProblems;

import java.util.HashMap;
import java.util.Map;

public class mapprogram1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        System.out.println("1.Using ForEach loop");
        map.forEach((k, v) -> System.out.println("{" + k + ":" + v + "}"));
        System.out.println("2.Using EntrySet loop");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println("{" + entry.getKey() + ":" + entry.getValue() + "}");
        }
        System.out.println("3.Using KeySet loop");
        for (Integer key : map.keySet()) {
            System.out.println("{" + key + ":" + map.get(key) + "}");

        }

    }
}