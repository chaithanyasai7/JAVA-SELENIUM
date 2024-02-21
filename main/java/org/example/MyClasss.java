//Accessing protected globally//using inheriance
package org.example;

public class MyClasss {
    protected int protectedField = 42;
}

class AnotherClass extends MyClasss {
    public void accessProtectedField() {
        int value = protectedField;
        System.out.println("Accessed protected field: " + value);
    }

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.accessProtectedField();
    }
}
