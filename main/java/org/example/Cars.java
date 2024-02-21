package org.example;
//abstraction using interface

interface CarStart
{
    void start();
}
interface CarStop
{
    void stop();
}
public class Cars implements CarStart, CarStop
{
    public void start()

    {
        System.out.println("The car engine has been started.");
    }
    public void stop()

    {
        System.out.println("The car engine has been stopped.");
    }
    public static void main(String []args)
    {
        Cars cars = new Cars();
        cars.start();
        cars.stop();
    }
}