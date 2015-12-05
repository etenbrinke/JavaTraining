package www3.ntu.edu;

import java.util.Scanner;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class MyComplexApp {

    public static void main(String[] args) {

        double real1, imag1, real2, imag2;
        String sNOT;
        String[] inputArray;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        String sComplexNumber1 = input.nextLine();
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        String sComplexNumber2 = input.nextLine();

        inputArray = sComplexNumber1.split("\\s+");
        real1 = Double.parseDouble(inputArray[0]);
        imag1 = Double.parseDouble(inputArray[1]);
        inputArray = sComplexNumber2.split("\\s+");
        real2 = Double.parseDouble(inputArray[0]);
        imag2 = Double.parseDouble(inputArray[1]);

        MyComplex c1 = new MyComplex(real1, imag1);
        MyComplex c2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + c1.toString() );
        sNOT = "";
        if (!c1.isReal()) {
            sNOT = "NOT ";
        }
        System.out.println(c1.toString() + " is " + sNOT + "a pure real number");

        sNOT = "";
        if (!c1.isImaginary()) {
            sNOT = "NOT ";
        }
        System.out.println(c1.toString() + " is " + sNOT +  "a pure imaginary number");

        System.out.println("Number 1 is: " + c2.toString() );
        sNOT = "";
        if (!c2.isReal()) {
            sNOT = "NOT ";
        }
        System.out.println(c2.toString() + " is " + sNOT + "a pure real number");

        sNOT = "";
        if (!c2.isImaginary()) {
            sNOT = "NOT ";
        }
        System.out.println(c2.toString() + " is " + sNOT +  "a pure imaginary number");

        sNOT = "";
        if (!c1.equals(c2)) {
            sNOT = "NOT ";
        }
        System.out.println(c1.toString() + " is " + sNOT +  "equal to " + c2.toString());

        System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2));
        System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.substract(c2));
     }
}
