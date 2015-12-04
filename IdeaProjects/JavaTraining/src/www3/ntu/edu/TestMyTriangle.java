package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class TestMyTriangle {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(0, 4);
        MyPoint p2 = new MyPoint(0, 0);
        MyPoint p3 = new MyPoint(4, 0);

        MyTriangle t1 = new MyTriangle(p1,p2,p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(t1);

        System.out.println("Distance p1-p2 is " + p1.distance(p2));
        System.out.println("Distance p2-p3 is " + p2.distance(p3));
        System.out.println("Distance p3-p1 is " + p3.distance(p1));
        System.out.println("Perimeter of t1 is " + t1.getPerimeter());

        System.out.println("Type of triangle is '" + t1.printType() + "'");

    }
}
