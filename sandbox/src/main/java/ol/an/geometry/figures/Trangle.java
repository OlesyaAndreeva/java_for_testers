package ol.an.geometry.figures;

public class Trangle {
    public static void printTrunglePerimetr(double a, double b, double c) {
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, trunglePerimetr(a,b,c));
        System.out.println(text);
    }
    public static double trunglePerimetr(double a, double b, double c) {
        return a+b+c;
    }

    public static void printTrungleArea(double a, double b, double c) {
        System.out.println
                ("Площадь треугольника состоронами "+ a + " , " + b + " и " + c + " = " + trungleArea(a, b, c));
    }

    public static double trungleArea(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p *(p-a)*(p-b)*(p-c));
    }
}
