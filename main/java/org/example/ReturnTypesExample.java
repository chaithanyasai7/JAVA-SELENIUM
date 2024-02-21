package org.example;
import java.util.Arrays;


public class ReturnTypesExample {

    void printMessage() {
        System.out.println("This is a void method");
    }
    int add(int a, int b) {
        return a + b;
    }
    String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    Object getNull() {
        return null;
    }

    public static void main(String[] args)
    {
        ReturnTypesExample example = new ReturnTypesExample();

        example.printMessage();

        int sum = example.add(5, 3);
        System.out.println("Sum: " + sum);

        String concatenatedString = example.concatenate("Hello, ", "World!");
        System.out.println("Concatenated String: " + concatenatedString);

        Object nullObject = example.getNull();
        System.out.println("Null Object: " + nullObject);
    }
}
