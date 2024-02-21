//overriding RTP
package org.example;

public class DemoRun
{
    public void Display()
    {
        System.out.println("this is parent class");
    }

}
class Sample extends DemoRun
{
    @Override
    public void Display()
    {
        System.out.println("this is child class");

    }

}
class MainClass
{
    public static void main(String[] args) {
        DemoRun demoRun = new Sample();
        demoRun.Display();
    }
}
