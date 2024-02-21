//method overloading CTP
package org.example;

public class FlightBooking {
    public void booking(String from ,String to)
    {
        System.out.println("Travelling to :"+to+ "from:" + from);
    }
    public void booking(String to,String from, String startDate)
    {
        System.out.println("Travelling to :"+to+ "from:"+from+ "on:" +startDate);

    }

}
class FlightBookingTrip extends FlightBooking
{
    public void booking(String to,String from, String startDate, String endDate)
    {
        System.out.println("Travelling to :"+to+ "from:"+from+ "on:" +startDate + "till:"+endDate);
    }

}
class MainBooking
{
    public static void main(String[] args)
    {
        FlightBookingTrip flightbookingtrip = new FlightBookingTrip();
        flightbookingtrip.booking("Bangalore","Andhra");
        flightbookingtrip.booking("Bangalore","Andhra","2/12/2024");
        flightbookingtrip.booking("Bangalore","Andhra","2/12/2024","2/15/2024");
    }
}
