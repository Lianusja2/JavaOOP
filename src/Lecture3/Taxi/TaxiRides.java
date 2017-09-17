package Lecture3.Taxi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class TaxiRides {

    List<TaxiRide> rides = new ArrayList<>();

    public void addRide(TaxiRide ride) {
        rides.add(ride);
    }

    public long getPrice(TaxiTariff tariff) {
        if (rides.isEmpty()) {
            throw new IllegalStateException("Can not calculate price as no rides are added");
        } else {
            long sum = 0;
            for (TaxiRide ride : rides) {
                sum += tariff.calculatePrice(ride);
            }
            return sum;
        }
    }


}
