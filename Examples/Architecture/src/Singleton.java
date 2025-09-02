/*
import eduni.distributions.Bernoulli;

Bernoulli source = new Bernoulli(0.7);
for (int i=0; i<10; i++) {
        System.out.println("sample "+i+"=" + source.sample());
        }

 */

public class Singleton {
    // Private static member to hold the unique instance
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Initialization code
    }

    // Public static method to access the unique instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the Singleton class
}