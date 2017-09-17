package Lecture3.Taxi;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class FamilyTariff  implements TaxiTariff{

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassangersNumber();
    }
}
