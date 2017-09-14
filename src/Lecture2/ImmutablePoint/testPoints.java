package Lecture2.ImmutablePoint;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class testPoints {
    public static void main(String[] args) {
      Point o = new Point (0,0);
        Point p1 = new Point (0,2);
        Point p2 = new Point (6,0);
        Point p3 = new Point (0,-5);
        Line l1 = new Line(o,p1);
        Line l2 = new Line(o,p2);
        Line l3 = new Line(o,p3);
        System.out.println("Length are following: " + l1.getLength()+" "+ l2.getLength()+" "+ l3.getLength());
        Lines lines = new Lines();
        lines.add(l1);
        System.out.println("Sum is: "+ lines.sumLength());
        System.out.println("Longest is: " + lines.longestLine());
        lines.add(l2);
        System.out.println("Sum is: "+ lines.sumLength());
        System.out.println("Longest is: " + lines.longestLine());
        lines.add(l3);
        System.out.println("Sum is: "+ lines.sumLength());
        System.out.println("Longest is: " + lines.longestLine());
    }
}
