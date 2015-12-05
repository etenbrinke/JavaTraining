package www3.ntu.edu;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class MyComplex {

    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void SetValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (real == imag);
    }

    public boolean equals(MyComplex another) {
        return ((this.real == another.real) && (this.imag == another.imag));
    }

    public double magnitude() {
        return Math.sqrt(real + imag);
    }

    public double argumentInRadians() {
        return Math.atan2(imag, real);
    }

    public int argumentInDegrees() {
    // convert radians to degrees : http://info.eps.surrey.ac.uk/elearning/materials/complex/Convert.swf
        return (int) (((180 / (Math.PI)) * Math.atan2(imag,real)));
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex add(MyComplex another) {
        return new MyComplex(this.real+another.real,this.imag+another.imag);
    }

    public MyComplex substract(MyComplex another) {
        return new MyComplex(this.real-another.real,this.imag-another.imag);
    }

    public MyComplex multiplyWith(MyComplex another) {
        return new MyComplex(((this.real*another.real)-(this.imag*another.imag)),(this.real*another.imag)+(this.imag*another.real));

    }

    public MyComplex divideBy(MyComplex another) {
        new MyComplex((this.real+this.imag)*(another.real-another.imag),(another.real+another.imag));
        return this;
    }

}
