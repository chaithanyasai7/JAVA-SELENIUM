package org.example;

public class PrimitiveReturn
{
    public int add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        PrimitiveReturn primitive = new PrimitiveReturn();
        int result = primitive.add(3,4);
        System.out.println(result);
    }
}
