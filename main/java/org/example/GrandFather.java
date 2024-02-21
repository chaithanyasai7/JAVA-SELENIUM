//hybrid
package org.example;


class GrandFather
{
    public void grandFather()
    {
        System.out.println("He is grandfather.");
    }
}

class Father extends GrandFather
{
    public void father()
    {
        System.out.println("He is father.");
    }
}
class Son extends Father
{
    public void sonn()
    {
        System.out.println("He is son.");
    }
}

class Daughter extends Father
{
    public void daughterr()
    {
        System.out.println("She is daughter.");
    }
    public static void main(String[]args)
    {

        Son son = new Son();
        son.grandFather();
        son.father();
        son.sonn();
        Daughter daughter = new Daughter();
        daughter.daughterr();
        daughter.father();
        daughter.grandFather();
    }
}
