public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}