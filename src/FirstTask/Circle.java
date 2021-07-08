package FirstTask;

 public class Circle extends Shape {
    final double pi = 3.14;
    double radius;

    protected Circle() {
        super();
        radius = 1.0;
    }

    protected Circle(double radius) {
        super();
        this.radius = radius;
    }

    protected Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return pi * radius * radius;
    }

     @Override
     protected double getPerimeter() {
         return 2 * pi * radius;
     }

     @Override
     protected boolean isInside(double x, double y) {
        return Math.sqrt(x * x + y * y) <= radius;
     }

     @Override
    public String toString() {
        return "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}

