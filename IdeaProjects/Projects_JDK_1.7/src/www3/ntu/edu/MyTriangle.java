package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class MyTriangle {

    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public String printType() {
        double d12 = v1.distance(v2);
        double d23 = v2.distance(v3);
        double d31 = v3.distance(v1);
        if ((d12 == d23) && (d23 == d31)) {
            return "equilateral";
        } else if ((d12 == d23) || (d12 == d31) || (d23 == d31)) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

}
