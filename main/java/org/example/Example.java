package org.example;

public class Example {

    public static final int PUBLIC_CONSTANT = 100;
    protected static int protectedVariable = 50;
    static int defaultVariable = 25;
    private static int privateVariable = 10;


    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected static final String protectedMethod() {
        return "This is a protected method.";
    }

    static String defaultMethod(int number) {
        return "This is a default method with a parameter: " + number;
    }

    private static void privateMethod() {
        System.out.println("This is a private method.");
    }


    public static void voidMethod() {
        System.out.println("This method has a void return type.");
    }


    protected static int intMethod() {
        return 42;
    }


    static String stringMethod() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("Public constant: " + PUBLIC_CONSTANT);
        System.out.println("Protected variable: " + protectedVariable);
        System.out.println("Default variable: " + defaultVariable);

        example.publicMethod();
        System.out.println(protectedMethod());
        System.out.println(defaultMethod(100));

        voidMethod();
        System.out.println("Int method result: " + intMethod());
        System.out.println("String method result: " + stringMethod());
    }
}
