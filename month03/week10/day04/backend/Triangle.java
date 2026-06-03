
public class Triangle extends Shape {

    private double height;
    private double base;

    public Triangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return height * base / 2;
    }

    @Override
    public double perimeter() {
        return 2 * Math.sqrt(height * height + base / 2 * base / 2) + base;
    }

}
