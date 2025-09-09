import java.util.Random;

public class ServicePointDistribution {
    public static void main(String[] args) {
        int totalCustomers = 100; // Number of customers to simulate
        Random rand = new Random();

        int cashierCount = 0;
        int selfServiceCount = 0;
        int driveThroughCount = 0;

        for (int i = 1; i <= totalCustomers; i++) {
            double random = rand.nextDouble(); // Random number between 0.0 and 1.0

            if (random < 0.40) { // 40% for Cashier
                cashierCount++;
                System.out.println("Customer " + i + " at Cashier (2-3 mins)");
            } else if (random < 0.75) { // Next 35% for Self-service
                selfServiceCount++;
                System.out.println("Customer " + i + " at Self-service (1-2 mins)");
            } else { // Remaining 25% for Drive-through
                driveThroughCount++;
                System.out.println("Customer " + i + " at Drive-through (2-3 mins)");
            }
        }
        System.out.println();
        System.out.println("Cashier: " + cashierCount);
        System.out.println("Self-service: " + selfServiceCount);
        System.out.println("Drive-through: " + driveThroughCount);
    }
}
