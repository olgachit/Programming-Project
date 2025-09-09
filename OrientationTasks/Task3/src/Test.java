import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0);
        List<Event> eventList = new ArrayList<>();
        ArrivalProcess ap = new ArrivalProcess("Arrival");

        ap.generateEvents(eventList, 10, clock);
        System.out.println("Final clock time: " + clock.getTime());

        ServicePoint sp = new ServicePoint();
        for (Event e : eventList) {
            sp.addCustomer(new Customer(e.time));
        }

        clock.setTime(clock.getTime() + 5);
        sp.processCustomers(clock.getTime());
    }
}
