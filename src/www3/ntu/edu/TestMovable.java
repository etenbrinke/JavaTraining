package www3.ntu.edu;

/**
 * Created by etenbrinke on 30/11/15.
 */
public class TestMovable {

    public static void main (String[] args) {

        Movable m1 = new MovablePoint(5, 6, 10, 10);     // upcast
        System.out.println(m1.toString());
        System.out.println("m1.moveLeft()");
        m1.moveLeft();
        System.out.println(m1.toString() + "\n");

        Movable m2 = new MovableCircle(2, 1, 2, 20, 20); // upcast
        System.out.println(m2.toString());
        System.out.println("m2.moveRight()");
        m2.moveRight();
        System.out.println(m2.toString() + "\n");

        Movable m3 = new MovableRectangle(2, 3, 10, 12, 2, 4); // upcast
        System.out.println(m3.toString());
        System.out.println("m3.moveLeft()");
        m3.moveLeft();
        System.out.println("m3.moveDown()");
        m3.moveDown();
        System.out.println(m3.toString());

    }

}
