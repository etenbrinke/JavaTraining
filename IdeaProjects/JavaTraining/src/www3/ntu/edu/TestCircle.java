package www3.ntu.edu;

/**
 * Created by etenbrinke on 22/11/15.
 */
public class TestCircle {

    public static void main(String[] args) {
        // Declare and allocate an instance of class Circle called c1
        //  with default radius and color
        Circle c1 = new Circle();
        // Use the dot operator to invoke methods of instance c1.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        //System.out.println(c1.radius);

        // Declare and allocate an instance of class circle called c2
        //  with the given radius and default color
        Circle c2 = new Circle(2.0);
        // Use the dot operator to invoke methods of instance c2.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3.0,"green");
        c3.setRadius(5.0);
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and the color " + c3.getColor() );
        System.out.println(c3.toString());   // explicit call
        System.out.println(c3);   // explicit call
        System.out.println("Operator '+' invokes toString() too: " + c3);
    }

}
