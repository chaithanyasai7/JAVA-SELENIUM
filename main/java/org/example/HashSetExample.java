package org.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);


        System.out.println("HashSet contents: " + numbers);

        boolean contains20 = numbers.contains(20);
        System.out.println("Does the set contain 20? " + contains20);

        int size = numbers.size();
        System.out.println("Size of the set: " + size);


        boolean removed = numbers.remove(30);
        System.out.println("Was 30 removed from the set? " + removed);


        System.out.println("HashSet contents after removal: " + numbers);


        System.out.println("Iterating over the HashSet elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        numbers.clear();
        System.out.println("HashSet cleared. Is the set empty? " + numbers.isEmpty());
    }
}

