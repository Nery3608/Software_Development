public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "%s: Area: %.2f Perimeter: %.2f, AR: %.2f";
    }

}
