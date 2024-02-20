package Shape.l26;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // Здесь вы можете реализовать расчет периметра для треугольника
        return 0.0;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a triangle with base: " + base + " and height: " + height);
    }
}

