package naylrush.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    @DisplayName("Constructing")
    void constructFigures() {
        new Square(0);
    }

    @Test
    @DisplayName("CalcArea")
    void calcArea() {
        Assertions.assertEquals((new Square(0)).calcArea(), 0.0);
        Assertions.assertEquals((new Square(10)).calcArea(), 100.0);
        Assertions.assertEquals((new Square(1.25)).calcArea(), 1.5625);
    }

    @Test
    @DisplayName("Dynamic CalcArea")
    void dynamicCalcArea() {
        Figure figure = new Square(5.55);
        Assertions.assertEquals(figure.calcArea(), 30.8025);
    }
}
