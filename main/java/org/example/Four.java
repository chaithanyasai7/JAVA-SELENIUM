package org.example;
import java.util.Scanner;

public class Four
{
    private int i =100;
    double d=4.5;
    protected char ch = 'c';
    public boolean b= true;

    public static void main(String[] args)
    {
        Four four = new Four();
        System.out.println(four.i);
        System.out.println(four.d);
        System.out.println(four.ch);
        System.out.println(four.b);
    }
}
