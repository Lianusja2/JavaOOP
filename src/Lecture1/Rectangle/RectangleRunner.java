package Lecture1.Rectangle;

public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,5);
        Rectangle rectangle2 = new Rectangle(5,5);
        Rectangles rectangles = new Rectangles();
        System.out.println("Площадь первого прямоугольника: " + rectangle1.getSquare());
        System.out.println("Периметр первого прямоугольника: " + rectangle1.getPerimeter());
        rectangles.addRectangle(rectangle1);
        System.out.println("Площадь с одним прямоугольникоми : " + rectangles.getRectangelsSquare());
        rectangles.addRectangle(rectangle2);
        System.out.println("Площадь с двумя прямоугольникоми : "+rectangles.getRectangelsSquare());
    }
}
