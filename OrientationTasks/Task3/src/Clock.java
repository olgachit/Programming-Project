//Question5
public class Clock {
    private static Clock instance;
    private int time;

    private Clock() {}

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(int t) {
        time = t;
    }
    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(10);
        System.out.println("Current time: " + clock.getTime());
    }
}
