package naylrush.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    @DisplayName("Constructing")
    void constructFigures() {
        new Rectangle(0, 0);
    }

    @Test
    @DisplayName("CalcArea")
    void calcArea() {
        Assertions.assertEquals((new Rectangle(0, 0)).calcArea(), 0.0);
        Assertions.assertEquals((new Rectangle(3, 4)).calcArea(), 12.0);
        Assertions.assertEquals((new Rectangle(7.32, 10002.1)).calcArea(), 73215.372);
    }

    @Test
    @DisplayName("Dynamic CalcArea")
    void dynamicCalcArea() {
        Figure figure = new Rectangle(4.2, 0.023);
        Assertions.assertEquals(figure.calcArea(), 0.0966);
    }
}
