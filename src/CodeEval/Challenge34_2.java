package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by etenbrinke on 17/11/15.
 * https://www.codeeval.com/open_challenges/34/
 */

public class Challenge34_2 {

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
