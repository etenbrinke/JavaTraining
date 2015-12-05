package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));

        MyPoint[] points = new MyPoint[10];
        int i;
        for (i=0; i<=9; i++) {
            points[i] = new MyPoint(i+1, i+1);
            System.out.println("x = " + points[i].getX() + ", y = " + points[i].getY());
        }

    }
}
