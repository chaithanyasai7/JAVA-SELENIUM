package org.example;

abstract class Mangoo {
    public  void fruit(){

    }
}

class Guava extends Mangoo{
    @Override
    public void fruit() {
        System.out.println("its guava");
    }
}
class Grapes extends Mangoo{
    @Override
    public void fruit() {
        System.out.println("its grapes");
    }

    public static void main(String[] args) {
        Grapes grapes = new Grapes();
        grapes.fruit();
    }
}
