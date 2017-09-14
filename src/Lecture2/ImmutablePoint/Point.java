package Lecture2.ImmutablePoint;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Point {

    final private double x;
    final private double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }



}
