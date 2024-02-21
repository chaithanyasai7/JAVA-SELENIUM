package org.example;

public class UncheckedExceptionExample {
    public static void main(String[] args) {

        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }


        try {
            int[] arr = {1, 2, 3};
            int element = arr[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }


        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }


        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}

