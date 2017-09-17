package Lecture3.Taxi;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class TaxiRide {
    /**
     * Поездка в такси (TaxiRide) включает количество пассажиров (passengers), расстояние в километрах (distance), длительность в минутах (duration).
     Есть несколько типов тарифов:
     1. Standard Tariff: 30 + 5 * distance + 2 * duration.
     2. Family Tariff: 50 + 20 * distance / passengers.
     */
    private final int passangersNumber;
    private final long distance;
    private final int duration;

    public TaxiRide(int passangersNumber, long distance, int duration) {
        if( passangersNumber <=0 || distance <=0 || duration <=0  ){
            throw new IllegalArgumentException("Enter Valid number of passengers, distance and duration");
        }
        this.passangersNumber = passangersNumber;
        this.distance = distance;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passangersNumber=" + passangersNumber +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }

    public int getPassangersNumber() {
        return passangersNumber;
    }

    public long getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}

