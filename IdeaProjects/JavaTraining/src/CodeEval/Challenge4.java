package CodeEval;

/**
 * Created by etenbrinke on 15/11/15.
 * https://www.codeeval.com/open_challenges/4/
 */

public class Challenge4 {

    public static void main(String[] args) {

        boolean prime;
        float i, j, k;
        int count = 1,sum = 0;

         i = 2;
         while (count <= 1000) {
              prime = true;
              for (j = i - 1; j >= 2; j--) {
                  k = i / j;
                  if (k == Math.round(k)) {
                      // k is integer
                      prime = false;
                      break;
                  }
              }
              if (prime) {
                  sum = sum + Math.round(i);
                  count++;
              }
              i++;
         }
         System.out.println(Math.round(sum));
    }
}
