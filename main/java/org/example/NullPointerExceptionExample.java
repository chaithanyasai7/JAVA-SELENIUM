package org.example;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        System.out.println("hello");
        String s = "virat";
        try {
            System.out.println(s.length());
            s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to call method on null object.");
        }
        System.out.println("world");
    }
}
