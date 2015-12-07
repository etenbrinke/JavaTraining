package JustMoreTraining;

import java.util.Scanner;

/**
 * Created by etenbrinke on 06/11/15.
 */
public class Calculator {

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate( ) {
        Scanner input = new Scanner (System.in);

        double result;

        System.out.println("Enter a number");
        double value = input.nextInt();

        System.out.println("Enter a number 2");
        double value2 = input.nextInt();

        System.out.println("What the fuck do you want to do with number 1 and number 2");
        String operation = input.next();

        switch (operation) {
            case "+":
                result = value + value2;
                break;
            case "-":
                result = value - value2;
                break;
            case "*":
                result = value * value2;
                break;
            case "/":
                result = value / value2;
                break;
            default:
                throw new IllegalArgumentException("not good");
        }

        System.out.printf("calculated %f %s %f = %f",value,operation,value2,result);

    }

}
