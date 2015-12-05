package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}
