package org.example;

public class Object
{
    public String Concate(String s1 , String s2)
    {
        return s1+s2;
    }

    public static void main(String[] args) {
        Object obj = new Object();
        String result = obj.Concate("hello","Hi");
        System.out.println(result);
    }
}
