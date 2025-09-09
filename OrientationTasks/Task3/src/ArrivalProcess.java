//Question6
import java.util.*;

class Event {
    int time;
    String type;

    Event(int time, String type) {
        this.time = time;
        this.type = type;
    }

    public String toString() {
        return "Event{time=" + time + ", type='" + type + '\'' + '}';
    }
}

public class ArrivalProcess {
    Random rand = new Random();
    String eventType;

    ArrivalProcess(String eventType) {
        this.eventType = eventType;
    }

    void generateEvents(List<Event> eventList, int count, Clock clock) {
        int currentTime = clock.getTime();
        for (int i = 0; i < count; i++) {
            int interval = rand.nextInt(10) + 1;
            currentTime += interval;
            clock.setTime(currentTime);
            eventList.add(new Event(currentTime, eventType));
        }
    }

    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0);
        List<Event> eventList = new ArrayList<>();
        ArrivalProcess ap = new ArrivalProcess("Arrival");

        ap.generateEvents(eventList, 10, clock);

        for (Event e : eventList) {
            System.out.println(e);
        }
    }
}
