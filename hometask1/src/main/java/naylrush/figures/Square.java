package naylrush.figures;

public class Square implements Figure {
    public double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calcArea() {
        return sideLength * sideLength;
    }
}
