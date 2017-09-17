package Lecture1.Rectangle;

        import java.util.ArrayList;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Rectangles {
    private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    public ArrayList<Rectangle> getRectangelsList() {
        return rectangles;
    }

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public int getRectangelsSquare() {
      int sum = 0;
      for(Rectangle rectangle: rectangles ){
      sum += rectangle.getSquare();}
      return sum;
    }

}
