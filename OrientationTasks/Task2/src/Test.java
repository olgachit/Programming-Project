public class Test {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.EXIT));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(1.0, EventType.ARRIVAL));

        System.out.println("Events in order:");
        eventList.displayEvents();
        System.out.println();

        Event next = eventList.getNextEvent();

        System.out.println("Remaining events:");
        eventList.displayEvents();
    }
}
