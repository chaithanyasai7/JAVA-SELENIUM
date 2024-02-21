//single
package org.example;


public class Ola {

    String name = "Chaithanya";
    public void BookingAlone()
    {
        System.out.println(name + " : is Travelling alone");
    }
}
class Share extends Ola
{
    public void SharedBooking(String otherperson)
    {
        System.out.println(name + "is travelling with:"+ otherperson);
    }

    public static void main(String[] args) {
        Share share = new Share();
        share.SharedBooking("sai");
        share.BookingAlone();
    }
}


