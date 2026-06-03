
public class Main {
    public static void main(String[] args) {
        Shape shape01 = new Shape("Yellow");
        shape01.setColor("red");
        System.out.println(shape01.getColor());
        shape01.printInfo();

        // Triange
        Shape triangle01 = new Triangle("Green", 10, 15);
        System.out.println(triangle01.area());
        System.out.println(triangle01.perimeter());
        triangle01.printInfo();

        // Abstract class cannot be instantiated
        AbstractShape square = new Square(10); // AbstractShape type
        square.area();
        square.perimeter();
    }
}
