package FirstTask;

public class DemoShapes {
    public static void main(String[] args){
        double x = 0.6;
        double y = 0.8;

        Rectangle rectangle = new Rectangle();
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println("(" + x + ", " + y + ") inside of Rectangle: " + rectangle.isInside(x, y));
        Circle circle = new Circle();
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());
        System.out.println("(" + x + ", " + y + ") inside of Circle: " + circle.isInside(x, y));
        Square square = new Square();
        System.out.println("Area = " + square.getArea());
        System.out.println("Perimeter = " + square.getPerimeter());
        System.out.println("(" + x + ", " + y + ") inside of Squere: " + square.isInside(x, y));

    }
}
