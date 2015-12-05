package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */
public class Shape {

    String color;
    Boolean filled;

    public Shape() {
        color="green";
        filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //public Boolean getFilled() {
    //    return filled;
    //}
    // by convention, the getter for a boolean variable XXX is called isXXX

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + filled + " filled";
    }
}
