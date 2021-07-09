package FirstTask;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width  " + width + " and length = " + length + " which is a subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public boolean isInside(double x, double y) {
        return -width <= 2 * x && 2 * x <= width && -length <= 2 * y && 2 * y <= length;
    }
}

