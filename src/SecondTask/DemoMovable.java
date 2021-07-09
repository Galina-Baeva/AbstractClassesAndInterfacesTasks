package SecondTask;

public class DemoMovable {
    public static void main(String[] args){
        MovableRectangle movableRectangle = new MovableRectangle(new MovablePoint(0, 2), new MovablePoint(1, 0));
        System.out.println(movableRectangle.toString());
        movableRectangle.moveUp();
        System.out.println(movableRectangle.toString());
        movableRectangle.moveRight();
        System.out.println(movableRectangle.toString());
        movableRectangle.moveDown();
        System.out.println(movableRectangle.toString());
        movableRectangle.moveLeft();
        System.out.println(movableRectangle.toString());
    }
}
