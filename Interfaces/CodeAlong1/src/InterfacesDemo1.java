public class InterfacesDemo1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape s : shapes) {
            System.out.print(s);
        }

        double totalShapeArea = Shape.sumArea(shapes);
        System.out.println("Total area of a shape: " + totalShapeArea);
    }
}

