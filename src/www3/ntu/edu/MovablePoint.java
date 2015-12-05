package www3.ntu.edu;

/**
 * Created by etenbrinke on 30/11/15.
 */
public class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;     // package access

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        y -= ySpeed;   // y-axis pointing down for 2D graphics
    }

    @Override
    public void moveDown() {
        y += ySpeed;   // y-axis pointing down for 2D graphics
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;   // x-axis pointing down for 2D graphics
    }

    @Override
    public void moveRight() {
        x += xSpeed;   // x-axis pointing down for 2D graphics
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
