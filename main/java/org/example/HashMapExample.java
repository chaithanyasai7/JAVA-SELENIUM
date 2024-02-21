package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1001, "chaithanya");
        studentMap.put(1002, "vadde");
        studentMap.put(1003, "sai");
        studentMap.put(1004, "chaithanya"); // Adding a duplicate key with a different value
        System.out.println("HashMap contents: " + studentMap);

        boolean containsKey1002 = studentMap.containsKey(1002);
        System.out.println("Does the map contain key 1002? " + containsKey1002);

        String nameOf1003 = studentMap.get(1003);
        System.out.println("Name of student with ID 1003: " + nameOf1003);

        String removedValue = studentMap.remove(1002);
        System.out.println("Value removed for key 1002: " + removedValue);


        System.out.println("HashMap contents after removal: " + studentMap);


        System.out.println("Iterating over the HashMap entries:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        studentMap.clear();
        System.out.println("HashMap cleared. Is the map empty? " + studentMap.isEmpty());
    }
}

