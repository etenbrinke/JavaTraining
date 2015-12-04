package www3.ntu.edu;

/**
 * Created by etenbrinke on 22/11/15.
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
 */

public class Circle {

    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // 1st constructor, which sets both radius and color to default
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle: radius=" + radius + " color=" + color;
    }
}
