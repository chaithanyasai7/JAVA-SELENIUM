//encapsuation getter and setter as well.
package org.example;

public class Bike {
    private String brand;
    private int gears;
    private double price;
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getGears()
    {
        return gears;
    }

    public void setGears(int gears)
    {
        if (gears > 0) {
            this.gears = gears;
        }
        else
        {
            System.out.println("Invalid number of gears. Gears must be positive.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.setBrand("YAMAHA R15");
        bike.setGears(6);
        bike.setPrice(250000.0);

        System.out.println("Brand: " + bike.getBrand());
        System.out.println("Number of Gears: " + bike.getGears());
        System.out.println("Price: " + bike.getPrice());
    }
}

