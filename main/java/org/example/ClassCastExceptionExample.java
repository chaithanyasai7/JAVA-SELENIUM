package org.example;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        System.out.println("hello");
        try {

            String obj = "example";
            String str = (String) obj;
            System.out.println("Casting successful");
        } catch (ClassCastException e) {
            System.out.println("downcasting without upcasting");
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("world");
    }
}
