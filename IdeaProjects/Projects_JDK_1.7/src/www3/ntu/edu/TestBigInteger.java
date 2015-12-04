package www3.ntu.edu;

import java.math.BigInteger;

/**
 * Created by etenbrinke on 24/11/15.
 */
public class TestBigInteger {

    public static void main(String[] args) {

        java.math.BigInteger i1 = new java.math.BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        java.math.BigInteger i2 = new java.math.BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(i1.add(i2));

    }

}
