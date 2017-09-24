package Lecture5;

/**
 * Created by inna.pshenychna on 9/24/2017.
 */
public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
