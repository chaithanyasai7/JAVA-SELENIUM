package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> uniqueNames = new HashSet<>();


        uniqueNames.add("vadde");
        uniqueNames.add("chaithanya");
        uniqueNames.add("sai");
        uniqueNames.add("chaithanya");


        System.out.println("Set contents: " + uniqueNames);


        boolean containssai = uniqueNames.contains("sai");
        System.out.println("Does the set contain sai? " + containssai);


        int size = uniqueNames.size();
        System.out.println("Size of the set: " + size);


        boolean removed = uniqueNames.remove("chaithanya");
        System.out.println("Was chaithanya removed from the set? " + removed);


        System.out.println("Set contents after removal: " + uniqueNames);


        System.out.println("Iterating over the set elements:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }


        uniqueNames.clear();
        System.out.println("Set cleared. Is the set empty? " + uniqueNames.isEmpty());
    }
}

