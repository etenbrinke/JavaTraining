package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */
public class CircleTwo extends Shape {

    private double radius;

    public CircleTwo() {
        radius = 1.0;
    }

    public CircleTwo(double radius) {
        this.radius = radius;
    }

    public CircleTwo(double radius, String color, Boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

}
