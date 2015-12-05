package www3.ntu.edu;

/**
 * Created by etenbrinke on 30/11/15.
 */
public class MovableRectangle implements Movable  {

    private int x1, x2, y1, y2;
    // can use xSpeed and ySpeed directly because they are package accessible
    private MovablePoint topleft;       // can use topleft.x, topleft.y directly because they are package accessible
    private MovablePoint bottomright;   // can use bottomright.x, bottomright.y directly because they are package accessible

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomright = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topleft.y -= topleft.ySpeed;
        bottomright.y -= bottomright.ySpeed;
    }

    @Override
    public void moveDown() {
        topleft.y += topleft.ySpeed;
        bottomright.y += bottomright.ySpeed;
    }

    @Override
    public void moveLeft() {
        topleft.x -= topleft.xSpeed;
        bottomright.x -= bottomright.xSpeed;
    }

    @Override
    public void moveRight() {
        topleft.x += topleft.xSpeed;
        bottomright.x += bottomright.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topleft.x=" + topleft.x +
                ", topleft.y=" + topleft.y +
                ", bottomright.x=" + bottomright.x +
                ", bottomright.y=" + bottomright.y +
                ", topleft.xSpeed=" + topleft.xSpeed +
                ", topleft.ySpeed=" + topleft.ySpeed +
                ", bottomright.xSpeed=" + bottomright.xSpeed +
                ", bottomright.ySpeed=" + bottomright.ySpeed +
                '}';
    }
}
