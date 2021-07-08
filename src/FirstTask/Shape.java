package FirstTask;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    protected Shape() {
        colour = "green";
        filled = true;
    }
    protected Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    protected String getColour() {
        return colour;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "A Shape with the colour of " + colour + (filled ? " filled" : " Not filled");
    }
    protected abstract double getArea();
    protected abstract double getPerimeter();
    protected abstract boolean isInside(double x, double y);
}
