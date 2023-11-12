package ol.an.geometry;

public class Exceptions {
    public static void main(String[] args) {
            var x = 1;
            var y = 0;
            if (y==0) {
                System.out.println("Делить на 0 низзя!");
            }
            else {
            var z = divide(x, y);
            System.out.println(z);
            System.out.println("Я посчитался!");
        }

    }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;
    }
}
