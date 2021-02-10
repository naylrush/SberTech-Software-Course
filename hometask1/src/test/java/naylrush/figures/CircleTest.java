package naylrush.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    @DisplayName("Constructing")
    void constructFigures() {
        new Circle(0);
    }

    @Test
    @DisplayName("CalcArea")
    void calcArea() {
        Assertions.assertEquals((new Circle(0)).calcArea(), 0.0);
        Assertions.assertEquals((new Circle(5)).calcArea(), 78.53981, 0.00001);
        Assertions.assertEquals((new Circle(1.25)).calcArea(), 4.90873, 0.00001);
    }

    @Test
    @DisplayName("Dynamic CalcArea")
    void dynamicCalcArea() {
        Figure figure = new Circle(3.202);
        Assertions.assertEquals(figure.calcArea(), 32.21013, 0.00001);
    }
}
