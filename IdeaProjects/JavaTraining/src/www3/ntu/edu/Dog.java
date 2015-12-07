package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}
