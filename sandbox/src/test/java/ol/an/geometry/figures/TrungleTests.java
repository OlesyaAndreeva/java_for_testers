package ol.an.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ol.an.geometry.figures.Trangle.trungleArea;

public class TrungleTests {
    @Test
    void CanCalculateArea() {
        double result = trungleArea(12, 13, 14);
        Assertions.assertEquals(72.30793524918272, result);
    }

}
