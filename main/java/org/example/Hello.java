//Abstraction using abstract class
package org.example;
abstract class Demo
{
    abstract void display();

}
public class Hello extends Demo
{
    void display()

    {
        System.out.println("Abstract method called.");
    }
    public static void main(String[] args)
    {
        Hello hello = new Hello ();
        hello.display();
    }
}