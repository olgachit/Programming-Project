import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomInt = random.nextInt(100);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();

        System.out.println("Random Integer: " + randomInt);
        System.out.println("Random Double: " + randomDouble);
    }
}

/*
//Using java.lang.math
public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = Math.random();

        System.out.println("Random Double: " + randomDouble);
    }
}
 */