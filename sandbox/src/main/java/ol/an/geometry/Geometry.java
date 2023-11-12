package ol.an.geometry;

import ol.an.geometry.figures.Rectangle;
import ol.an.geometry.figures.Square;
import ol.an.geometry.figures.Trangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(4.0));

        Rectangle.printRectangleArea(3.0, 5.0);

        Trangle.printTrunglePerimetr(14.0,12.0,12.0);
        Trangle.printTrungleArea(14.0,12.0,12.0);
        Trangle.printTrungleArea(1.0,16.0,12.0);
    }

}
