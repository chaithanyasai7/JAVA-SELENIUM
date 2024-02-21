package org.example;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            System.out.println("hello");
            System.out.println(a[5]);
            System.out.println("world");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
    }
}
