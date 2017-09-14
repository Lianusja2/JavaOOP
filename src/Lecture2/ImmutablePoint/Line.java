package Lecture2.ImmutablePoint;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Line {

    final private Point start;
    final private Point end;

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                ", length=" + getLength() +
                '}';
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

   public double getLength(){
   return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) +  Math.pow(end.getY() - start.getY(), 2));
   }




}
