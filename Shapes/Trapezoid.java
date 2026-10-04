public class Trapezoid extends Shape {
    private final double a, b, height;
    private final double side1, side2;

    public Trapezoid(double a, double b, double height, double side1, double side2) {
        super("Трапеция");
        this.a = a;
        this.b = b;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return (a + b) / 2 * height;
    }

    @Override
    public double perimeter() {
        return a + b + side1 + side2;
    }
}