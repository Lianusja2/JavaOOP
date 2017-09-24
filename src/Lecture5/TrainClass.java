package Lecture5;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by inna.pshenychna on 9/24/2017.
 */
public class TrainClass implements Train {

    Random rand = new Random();

    private final int length = rand.nextInt(50);
    private int currentLocation = 1;
    private HashMap<Integer, Boolean> carriage = new HashMap<Integer, Boolean>();

    public TrainClass() {
        for (int i = 1; i <= length; i++) {
            carriage.put(i, rand.nextBoolean());
        }
    }

    @Override
    public void turnLeft() {
        if (currentLocation == 1) {
            currentLocation = length;

        } else {
            currentLocation--;
        }
    }

    @Override
    public void turnRight() {
        if (currentLocation == length) {
            currentLocation = 1;

        } else {
            currentLocation++;
        }
    }

    @Override
    public void lightOn() {
        carriage.put(currentLocation, true);
    }

    @Override
    public void lightOff() {
        carriage.put(currentLocation, false);

    }

    @Override
    public boolean isLightOn() {
        return carriage.get(currentLocation);
    }

    @Override
    public boolean isLength(int expectedLength) {
        return length == expectedLength;
    }

    @Override
    public String toString() {
        return "TrainClass{" +
                ", length=" + length +
                ", currentLocation=" + currentLocation +
                ", carriage=" + carriage +
                '}';
    }

}
