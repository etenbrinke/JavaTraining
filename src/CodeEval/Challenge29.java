package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by etenbrinke on 11/11/15.
 * https://www.codeeval.com/browse/29/
 */

public class Challenge29 {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            String sCurrentLine;
            int i;

            br = new BufferedReader(new FileReader("challenge29.txt"));

            while ((sCurrentLine = br.readLine()) != null) {

                String[] numbers = sCurrentLine.split(",");
                System.out.print(numbers[0]);
                for (i=1 ; i <= numbers.length-1; i++) {
                    if (!numbers[i].equals(numbers[i-1])) {
                        System.out.print("," + numbers[i]);
                    }
                }
               System.out.println();
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

// input file :
// 1,1,1,2,2,3,3,4,4
// 2,3,4,5,5
// 12,13,13,15

// pseudo
//
// while (line) {
//   print line(0)
//   for (i = 1 ; i <= length(line)-1 ; i++)
//      if (line(i) != line(i-1) {
//          print ("," + line(i)
//      }
// }
