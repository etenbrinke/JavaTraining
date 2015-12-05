package www3.ntu.edu;

/**
 * Created by etenbrinke on 25/11/15.
 */
public class DoubleHeightAndAlwaysBlackCylinder extends Cylinder {
    public DoubleHeightAndAlwaysBlackCylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double getHeight() {
        return super.getHeight()*2;
    }

    @Override
    public String getColor() {
        return "BLAAAAACK!!";
    }
}
