package Lecture1.Rectangle;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Rectangle {

    private int width;
    private int height;


    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getPerimeter(){
      return   (width+height)*2;
    }

    public int getSquare(){
        return  width*height;
    }
}
