package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by etenbrinke on 11/11/15.
 * https://www.codeeval.com/browse/8/
 */

public class Challenge8 {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            String sCurrentLine;
            int i;

            br = new BufferedReader(new FileReader("challenge8.txt"));

            while ((sCurrentLine = br.readLine()) != null) {

                if (!sCurrentLine.equals("")) {
                    String[] words = sCurrentLine.split(" ");

                    for (i = words.length - 1; i >= 0; i--) {
                        System.out.print(words[i] + " ");
                    }
                    System.out.println();
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

// input file :
// Hello World
//
// Hello CodeEval
// aaa bbb