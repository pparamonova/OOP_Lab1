public class Rectangle extends Shape {
    private final double width, height;

    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}