package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List contents: " + numbers);

        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        numbers.set(1, 25);
        System.out.println("Updated list contents: " + numbers);

        numbers.remove(2);
        System.out.println("List contents after removing element at index 2: " + numbers);

        boolean contains20 = numbers.contains(20);
        System.out.println("Does the list contain 20? " + contains20);

        int size = numbers.size();
        System.out.println("Size of the list: " + size);

        numbers.clear();
        System.out.println("List cleared. Is the list empty? " + numbers.isEmpty());
    }
}

