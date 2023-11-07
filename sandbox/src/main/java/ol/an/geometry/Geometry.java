package ol.an.geometry;

import ol.an.geometry.figures.Rectangle;
import ol.an.geometry.figures.Square;
import ol.an.geometry.figures.Trangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7);
        Square.printSquareArea(3.5);

        Rectangle.printRectangleArea(3.0, 5.0);

        Trangle.printTrunglePerimetr(14,12,12);
        Trangle.printTrungleArea(14.0,12.0,12.0);
    }

}
