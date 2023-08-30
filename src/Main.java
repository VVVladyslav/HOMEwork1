public class Main {
    public static void main(String[] args) {

        ShapeResult shapeResult = new ShapeResult();

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape trapeze = new Trapeze();

        shapeResult.printShapeName(circle);
        shapeResult.printShapeName(quad);
        shapeResult.printShapeName(triangle);
        shapeResult.printShapeName(rectangle);
        shapeResult.printShapeName(trapeze);
    }
}