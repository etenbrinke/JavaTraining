package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class MyCircle {

    MyPoint center;
    int x,y,radius;

    public MyCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
