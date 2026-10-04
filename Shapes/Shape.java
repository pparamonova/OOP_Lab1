public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("%-12s | площадь = %8.2f | периметр = %8.2f",
                name, area(), perimeter());
    }
}