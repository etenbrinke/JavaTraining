package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by etenbrinke on 11/11/15.
 * https://www.codeeval.com/browse/92/
 */

public class Challenge92 {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            String sCurrentLine;
            int TotalWords;

            br = new BufferedReader(new FileReader("challenge92.txt"));

            while ((sCurrentLine = br.readLine()) != null) {

                String[] Words = sCurrentLine.split(" ");
                TotalWords = Words.length-1;
                System.out.println(Words[TotalWords-1]);

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

// input :
//   some line with text
//    another line