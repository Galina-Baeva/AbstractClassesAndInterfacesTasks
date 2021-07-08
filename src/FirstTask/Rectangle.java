package FirstTask;

public class Rectangle extends Shape {
    double width;
    double length;

    protected Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }
    protected Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    protected Rectangle (double width, double length, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width  " + width + " and length = " + length + " which is a subclass of " + super.toString();
    }

    @Override
    protected double getArea() {
        return width * length;
    }

    @Override
    protected double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    protected boolean isInside(double x, double y) {
        return -width <= 2 * x && 2 * x <= width && -length <= 2 * y && 2 * y <= length;
    }
}

