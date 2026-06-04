
public abstract class AbstractShape {

    private String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    // not implemented
    public abstract void area();

    public abstract void perimeter();

    // with implementation
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
