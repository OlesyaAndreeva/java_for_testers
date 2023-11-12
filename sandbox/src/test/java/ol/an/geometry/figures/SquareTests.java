package ol.an.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

@Test
    void canCalculateArea() {
    var s = new Square(5.0);
        double result = s.area();
       Assertions.assertEquals(25.0, result);
    //if (result != 25.0) {throw new AssertionError(String.format("Ожидаемый %f, фактический %f", 25.0, result));}
    }

    @Test
    void canCalculatePerimetr() {
    Assertions.assertEquals(20, new Square(5.0).perimetr());
    }

    @Test
    void cannotCreateSquareWithNegatieSide() {
    try {
        new Square(5.0);
        Assertions.fail();
    } catch (IllegalArgumentException exception) {
        //OK
    }
    }

}
