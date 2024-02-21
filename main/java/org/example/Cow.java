package org.example;

public class Cow {
    protected int protectedField;

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}

class Mouse extends Cow {
    public void accessProtected() {

        protectedField = 20;
        System.out.println("Protected field: " + protectedField);
        protectedMethod();
    }
}

    class main {
        public static void main(String[] args) {
            Mouse obj = new Mouse();
            obj.accessProtected();
        }
    }



