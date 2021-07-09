package SecondTask;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 1;
        ySpeed = 1;
    }

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        xSpeed = 1;
        ySpeed = 1;
    }

    @Override
    public String toString() {
        return "point (" + x + ", " + y + ")";
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }
}
