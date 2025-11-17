public interface Shape {

    double getArea();

    double getPerimeter();

    String getName();

    default double getAspectRatio() {
        return 1.0;
    }

    static double sumArea(Shape[] shapes) {
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

}
