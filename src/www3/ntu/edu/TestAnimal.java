package www3.ntu.edu;

/**
 * Created by etenbrinke on 27/11/15.
 */

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();                       // Meow!
        Dog dog1 = new Dog();
        dog1.greeting();                       // Woof!
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();                    // Woow!

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();                    // Meow!
        Animal animal2 = new Dog();
        animal2.greeting();                    // Woof!
        Animal animal3 = new BigDog();
        animal3.greeting();                    // Woow!
     //   Animal animal4 = new Animal();       you cannot create an object from abstract class

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
     //   Cat cat2 = (Cat)animal2;              Dog cannot be casted from Cat
        dog2.greeting(dog3);                    // Woooooooooof!
        dog3.greeting(dog2);                    // Woooooooooof!
        dog2.greeting(bigDog2);                 // Woooooooooof!
        bigDog2.greeting(dog2);                 // Woooooowwwww!
        bigDog2.greeting(bigDog1);              // Woooooowwwww!

    }
}
