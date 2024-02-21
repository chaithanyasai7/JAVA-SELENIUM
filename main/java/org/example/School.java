//abstraction
package org.example;


abstract class School
{
    abstract void startClass();
    void endClasses()
    {
        System.out.println("Classes for the day have ended.");
    }
}
class PrimarySchool extends School {
    @Override
    void startClass()
    {
        System.out.println("Primary school classes have started.");
    }
}
class HighSchool extends School {

    @Override
    void startClass()
    {
        System.out.println("High school classes have started.");
    }
}

class Main {
    public static void main(String[] args) {

        PrimarySchool primarySchool = new PrimarySchool();
        HighSchool highSchool = new HighSchool();


        primarySchool.startClass();
        primarySchool.endClasses();

        highSchool.startClass();
        highSchool.endClasses();
    }
}