//method overloading compile time polymorphism
package org.example;

class Calculator {

    static int add(int a, int b)
    {
        return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }
    static int add(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int sum1 = Calculator.add(5, 10);
        int sum2 = Calculator.add(5, 10, 15);
        int sum3 = Calculator.add(10,20,23,34);

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}

