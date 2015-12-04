package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by etenbrinke on 17/11/15.
 */

// https://www.codeeval.com/open_challenges/34/

public class Challenge34 {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            String sCurrentLine, numbersArray, sSum;
            int i, j, sum, first, second;

            br = new BufferedReader(new FileReader("challenge34.txt"));

            while ((sCurrentLine = br.readLine()) != null) {

                if (!sCurrentLine.equals("")) {
                    String[] inputArray = sCurrentLine.split(";");
                    numbersArray = inputArray[0];
                    sSum = inputArray[1];
                    String[] sNumbers = numbersArray.split(",");
                    boolean pairFound = false;
                    StringBuilder pairArray = new StringBuilder();

                    if (sNumbers.length == 1) {
                        System.out.println("NULL");
                    } else {

                        for (i=0 ; i <= sNumbers.length-1; i++) {
                            for (j=i+1 ; j <= sNumbers.length-1; j++) {
                                first = Integer.parseInt(sNumbers[i]);
                                second = Integer.parseInt(sNumbers[j]);
                                sum = first + second;
                                if ((sum == Integer.parseInt(sSum)) && (first != second)) { // pair numbers must be unique according CodeEval
                                    if (pairFound) {
                                        pairArray.append(";" + first + "," + second);
                                    } else {
                                        pairArray.append(first + "," + second);
                                    }
                                    pairFound = true;
                                }
                            }
                        }
                        if (pairFound) {
                            System.out.println(pairArray.toString());
                        } else {
                            System.out.println("NULL");
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

/**
 * 1,2,3,4,6;5
 * 2,4,5,6,9,11,15;20
 i=1
 j=2-5  1,4
 i=2
 j=3-5   2,3
 i=3
 j=4-5
 i=4
 j=5
 i=5
 j=--
 for (i=1; i <=length.numbers-1 ; i++)
 for (j=i+1; j <= length.numbers-1; j++)
 first = number[i]
 second = number[j]
 sum = first + second
 if (sum == to.int(sSum)) && (first =! second)
 storePair(first, second)
 */