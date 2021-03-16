package naylrush.figures;

public class Rectangle implements Figure {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
