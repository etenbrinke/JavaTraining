package BigJava;

/**
 * Created by etenbrinke on 20/12/15.
 */
public class TestPair {

    public static void main(String[] args) {

        Pair pair = new Pair<>(1,"a");
        System.out.println("first: " + pair.getFirst());
        System.out.println("second: " + pair.getSecond());
        System.out.println(pair.toString());

        String[] names = { "Ep", "tB", "Em"};
        Pair secpair = new Pair<>(names,23);
        System.out.println("first: " + secpair.getFirst());
        System.out.println("second: " + secpair.getSecond());
        System.out.println(secpair.toString());

    }
}
