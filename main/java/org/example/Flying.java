package org.example;

interface Flying {
    void fly();
}

interface Driving {
    void drive();
}

class Airplane implements Flying {
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}


class Car implements Driving {
    public void drive() {
        System.out.println("Car is driving.");
    }
}


class FlyingCar implements Flying, Driving {
    public void fly() {
        System.out.println("Flying car is flying.");
    }

    public void drive() {
        System.out.println("Flying car is driving.");
    }


    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Car car = new Car();
        FlyingCar flyingCar = new FlyingCar();

        airplane.fly();
        car.drive();
        flyingCar.fly();
        flyingCar.drive();
    }
}

