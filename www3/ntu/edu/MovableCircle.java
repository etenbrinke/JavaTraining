package www3.ntu.edu;

/**
 * Created by etenbrinke on 30/11/15.
 */
public class MovableCircle implements Movable {

    private MovablePoint center;   // can use center.x, center.y directly because they are package accessible
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // Call the MovablePoint's constructor to allocate the center instance.
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;

    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "centerx=" + center.x +
                ", center.y=" + center.y +
                ", center.xSpeed=" + center.xSpeed +
                ", center.ySpeed=" + center.ySpeed +
                ", radius=" + radius +
                '}';
    }
}
