package org.example;

public class StringMethodsExample {
    public static void main(String[] args) {

        String str = "Chaithanya";

        int length = str.length();
        System.out.println("Length of the string: " + length);

        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        String substr1 = str.substring(7);
        System.out.println("Substring from index 7: " + substr1);

        String substr2 = str.substring(3, 8);
        System.out.println("Substring from index 3 to 8: " + substr2);


        boolean containsWorld = str.contains("anya");
        System.out.println(containsWorld);


        int indexOfComma = str.indexOf("y");
        System.out.println("Index of 'y': " + indexOfComma);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        String replacedStr = str.replace("anya", "sai");
        System.out.println("Replaced string: " + replacedStr);

        String stringWithWhitespace = "   chaithanya   ";
        String trimmedStr = stringWithWhitespace.trim();
        System.out.println("Trimmed string: " + trimmedStr);
    }
}

