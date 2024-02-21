package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("vadde");
        queue.add("chaithanya");
        queue.add("sai");
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.remove());
        System.out.println("is empty" + queue.isEmpty());
        System.out.println("size" + queue.size());
    }
}

