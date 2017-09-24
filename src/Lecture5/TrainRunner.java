package Lecture5;

/**
 * Created by inna.pshenychna on 9/24/2017.
 */
public class TrainRunner {

    public static void main(String[] args) {
        Train train = new TrainClass();
        System.out.println(train);
        System.out.println(findLength(train));
        System.out.println(train);
    }

    public static int findLength(Train train) {
        int expectedLength = 1;
        while (!train.isLength(expectedLength)) {
            if (train.isLightOn()) {
                train.lightOn();
            }
            expectedLength++;
            train.turnRight();
        }
        return expectedLength;
    }
}
