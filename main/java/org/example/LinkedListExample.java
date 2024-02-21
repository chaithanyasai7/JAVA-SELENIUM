package org.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("vadde");
        names.add("chaithanya");
        names.add("sai");


        System.out.println("List contents: " + names);


        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);


        names.set(0, "chaithu");
        System.out.println("Updated list contents: " + names);


        names.remove(2);
        System.out.println("List contents after removing element at index 2: " + names);


        boolean containsCharlie = names.contains("Charlie");
        System.out.println("Does the list contain Charlie? " + containsCharlie);

        int size = names.size();
        System.out.println("Size of the list: " + size);

        names.clear();
        System.out.println("List cleared. Is the list empty? " + names.isEmpty());
    }
}

