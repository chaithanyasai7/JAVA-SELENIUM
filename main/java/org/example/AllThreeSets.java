package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllThreeSets {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(100);
        myHashSet.add(290);
        myHashSet.add(103);
        myHashSet.add(400);
        System.out.println("HashSet: " + myHashSet);

        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(100);
        myLinkedHashSet.add(290);
        myLinkedHashSet.add(103);
        myLinkedHashSet.add(400);
        System.out.println("LinkedHashSet: " + myLinkedHashSet);

        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(100);
        myTreeSet.add(290);
        myTreeSet.add(103);
        myTreeSet.add(400);
        System.out.println("TreeSet: " + myTreeSet);
    }
}

