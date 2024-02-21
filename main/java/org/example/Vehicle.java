//hierarchial
package org.example;


class Vehicle {
    void drive()
    {
        System.out.println("Vehicle is being driven.");
    }
}


class Carsss extends Vehicle {
    void drift()
    {
        System.out.println("Carsss is drifting.");
    }
}


class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is loading goods.");
    }

    public static void main(String[] args) {

        Carsss Carsss = new Carsss();
        Truck truck = new Truck();

        Carsss.drive();
        Carsss.drift();
        truck.drive();
        truck.load();
    }
}




