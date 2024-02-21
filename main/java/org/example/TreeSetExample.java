package org.example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();

        names.add("chaithanya");
        names.add("vadde");
        names.add("sai");


        System.out.println("TreeSet contents: " + names);

        boolean containsvadde = names.contains("vadde");
        System.out.println("Does the set contain vadde? " + containsvadde);

        int size = names.size();
        System.out.println("Size of the set: " + size);

        boolean removed = names.remove("sai");
        System.out.println("Was sai removed from the set? " + removed);

        System.out.println("TreeSet contents after removal: " + names);

        names.clear();
        System.out.println("TreeSet cleared. Is the set empty? " + names.isEmpty());
    }
}

