import java.util.ArrayList;
import java.util.Random;

public class arrivalTest {
    public static void main(String[] args) {
        Random rng = new Random();

        ArrayList<Customer> customers = new ArrayList<>();
        Customer c, c2, c3;

        c = new Customer(4.0, true);
        c2 = new Customer(8.0, true);
        c3 = new Customer(16.0, true);

        customers.add(c);
        customers.add(c2);
        customers.add(c3);

        for (Customer customer : customers) {

            boolean driveThru = rng.nextDouble() < 0.25;
            boolean selfService = !driveThru && rng.nextDouble() < 0.35 / (1 - 0.25);
            boolean cashierRoute = !driveThru && !selfService;
            boolean takeAway = driveThru || rng.nextDouble() < 0.60;

            customer.isEatIn = !takeAway;

            if (driveThru) {
                System.out.printf("[%.2f] Customer %d arrived (Drive-through)%n", customer.arrivalTime, customer.id);
                customer.addTime(rng.nextInt(2,4));
                System.out.println("Leave time: " + customer.leaveTime);
                System.out.println("Total time: " + customer.totalTime());
            } else if (selfService) {
                System.out.printf("[%.2f] Customer %d arrived (Self-service kiosk)%n", customer.arrivalTime, customer.id);
                customer.addTime(rng.nextInt(1,3));
                if (!takeAway) {
                    System.out.println("Customer is eating in");
                    customer.addTime(rng.nextInt(10,21));
                }
                System.out.println("Leave time: " + customer.leaveTime);
                System.out.println("Total time: " + customer.totalTime());
            } else if (cashierRoute) {
                System.out.printf("[%.2f] Customer %d arrived (Cashier)%n", customer.arrivalTime, customer.id);
                customer.addTime(rng.nextInt(2,4));
                if (!takeAway) {
                    System.out.println("Customer is eating in");
                    customer.addTime(rng.nextInt(10,21));
                }
                System.out.println("Leave time: " + customer.leaveTime);
                System.out.println("Total time: " + customer.totalTime());
            }
        }
    }
}
