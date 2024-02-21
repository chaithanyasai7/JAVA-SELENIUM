package org.example;

public class StringOutofBounds
{
    public static void main(String[] args) {
        String s = "chaithanya";
        try {
            System.out.println("hello");
            System.out.println(s.charAt(12));
            System.out.println("world");
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("unable to access index");

        }
        }
    }

