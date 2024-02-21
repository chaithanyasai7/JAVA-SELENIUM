package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AllThreeMaps
{
    public static void main(String[] args) {
        HashMap<Integer,String> myHashmap =new HashMap<>();
        myHashmap.put(100,"vadde");
        myHashmap.put(290,"chaithanya");
        myHashmap.put(103,"sai");
        myHashmap.put(400,"ITT");
        System.out.println("myHashmap" +myHashmap);

        LinkedHashMap<Integer,String> myLinkedHashMap =new LinkedHashMap<>();
        myLinkedHashMap.put(100,"vadde");
        myLinkedHashMap.put(290,"chaithanya");
        myLinkedHashMap.put(103,"sai");
        myLinkedHashMap.put(400,"ITT");
        System.out.println("myLinkedHashMap" + myLinkedHashMap);

        TreeMap<Integer,String> myTreemap =new TreeMap<>();
        myTreemap.put(100,"vadde");
        myTreemap.put(290,"chaithanya");
        myTreemap.put(103,"sai");
        myTreemap.put(400,"ITT");
        System.out.println("myTreemap" +myTreemap);

    }
}
