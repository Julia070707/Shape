package Shape.l26.geometryapp;

import Shape.l26.Circle;
import Shape.l26.Rectangle;
import Shape.l26.Shape;
import Shape.l26.Triangle;

public class GeometryApp {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 8.0);

        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    private static void displayShapeInfo(Shape shape) {
        shape.displayInfo();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}
