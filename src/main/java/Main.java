import base.Shape;

public class Main {
    public static void main(String[] args) {

        ShapePrinter printer = new ShapePrinter();
        printer.printShapeName(new Diamond("object1"));
        printer.printShapeName(new Circle("object2"));
        printer.printShapeName(new Quad("object3"));
        printer.printShapeName(new Rectangle("object4"));
        printer.printShapeName(new Triangle("object5"));
    }
}
