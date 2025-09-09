import java.util.LinkedList;
import java.util.Queue;

class Customer {
    int arrivalTime;
    Customer(int time) { arrivalTime = time; }
}

class ServicePoint {
    Queue<Customer> queue = new LinkedList<>();

    void addCustomer(Customer c) {
        queue.add(c);
    }

    void processCustomers(int currentTime) {
        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            int timeInSystem = currentTime - c.arrivalTime;
            System.out.println("Customer spent " + timeInSystem + " minutes in system.");
        }
    }
}
