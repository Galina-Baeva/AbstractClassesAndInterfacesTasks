package FirstTask;

 public class Circle extends Shape {
    private final double pi = 3.14;
    protected double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

     @Override
     public double getPerimeter() {
         return 2 * pi * radius;
     }

     @Override
     public boolean isInside(double x, double y) {
        return Math.sqrt(x * x + y * y) <= radius;
     }

     @Override
    public String toString() {
        return "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}

