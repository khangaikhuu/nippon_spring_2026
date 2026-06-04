public class Shape {
    // Encapsulation of Information
    // Information Hiding
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    public void printInfo(){
        System.out.println("Shape has color : "+ color + ", area of " + area() + " perimeter of " + perimeter());
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
