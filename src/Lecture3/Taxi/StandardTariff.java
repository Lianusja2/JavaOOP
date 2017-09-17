package Lecture3.Taxi;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class StandardTariff implements TaxiTariff {

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
