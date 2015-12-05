package JustMoreTraining;

/**
 * Created by etenbrinke on 06/11/15.
 */
public class Application {
    public static void main(String[] args) {

        testWhile();

        testFor();
    }

    private static void testWhile () {
        int value = 0;

        while(value < 5)
        {
            System.out.println("Hello " + value);

            value = value + 1;
        }
    }

    private static void testFor() {
        for(int i=0 ; i< 5; i++) {
            System.out.printf("the value of 1 is: %d\n", 1);
        }
    }

}
