package org.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new TreeMap<>();

        studentMap.put(1001, "chaithanya");
        studentMap.put(1002, "Vadde");
        studentMap.put(1003, "sai");

        System.out.println("TreeMap contents: " + studentMap);

        boolean containsKey1002 = studentMap.containsKey(1002);
        System.out.println("Does the map contain key 1002? " + containsKey1002);

        String nameOf1003 = studentMap.get(1003);
        System.out.println("Name of student with ID 1003: " + nameOf1003);

        String removedValue = studentMap.remove(1002);
        System.out.println("Value removed for key 1002: " + removedValue);

        System.out.println("TreeMap contents after removal: " + studentMap);

        System.out.println("TreeMap cleared. Is the map empty? " + studentMap.isEmpty());
    }
}

