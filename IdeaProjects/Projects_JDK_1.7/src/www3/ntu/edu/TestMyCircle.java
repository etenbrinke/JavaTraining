package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class TestMyCircle {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        MyCircle c1 = new MyCircle(p1,10);
        MyCircle c2 = new MyCircle(2,3,12);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Area of circle c1 is " + c1.getArea());
        System.out.println("Area of circle c2 is " + c2.getArea());

    }
}
