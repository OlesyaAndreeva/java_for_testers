package ol.an.geometry.figures;

import static jdk.internal.org.jline.utils.Colors.s;

public class Square {

public double side;

    public Square(double side) {
        this.side = side;
    }
    public static void printSquareArea(Square s) {
        String text = String.format("Площадь квадрата со стороной %f = %f", s.side, s.area());
        System.out.println(text);
    }
    public double area() {
    return this.side*this.side;
    }
    public double perimetr() {
        return this.side * 4;
    }
}
