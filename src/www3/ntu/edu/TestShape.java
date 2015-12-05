package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */
public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Shape("purpe",false);
        if (s1.isFilled()) {
            System.out.println("Shape of color is " + s1.getColor() + " and shape is filled");
        } else {
            System.out.println("Shape of color is " + s1.getColor() + " and shape is not filled");
        }

        CircleTwo c1 = new CircleTwo(10.5);
        System.out.println(c1.toString());

        Square sq1 = new Square();
        System.out.println(sq1.toString());

        Square sq2 = new Square(3.0,"black",true);
        System.out.println(sq2.toString());
        System.out.println("Area of sq2=" + sq2.getArea());
        System.out.println("Perimeter of sq2=" + sq2.getPerimeter());
    }

}
