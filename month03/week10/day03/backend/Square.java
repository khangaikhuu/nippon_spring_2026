
public class Square extends AbstractShape {

    private double side;

    public Square(double side) {
        super("Blue");
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Square area is " + (side * side));
    }

    @Override
    public void perimeter() {
        System.out.println("Square perimeter is " + (4 * side));
    }
}
