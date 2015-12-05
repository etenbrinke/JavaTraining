package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */
public class Square extends Rectangle {

    public Square() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side,side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return getLength();
    }

    public void setSide (double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
        setWidth(side);
    }

    // no need to override these methods
//    @Override
//    public double getArea() {
//        return getLength()*getWidth();
//    }

//    @Override
//    public double getPerimeter() {
//        return 2*getWidth() + 2*getLength();
//    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
