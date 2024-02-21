package org.example;

//multilevel



class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color");
    }

    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.bark();
        labrador.eat();
        labrador.color();
    }
}


