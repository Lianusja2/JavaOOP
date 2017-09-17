package Lecture3.Taxi;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class TaxiRunner {
    public static void main(String[] args){
        TaxiRides rides = new TaxiRides();
        rides.addRide(new TaxiRide(2,2,2));
        rides.addRide(new TaxiRide(1,5,1));

        System.out.println( "Standard tariff price is: "+ rides.getPrice(new StandardTariff()));
        System.out.println( "Family tariff price is: "+ rides.getPrice(new FamilyTariff()));

    }
}
