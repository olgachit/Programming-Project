public class Customer {
    private static int nextId = 1;
    public final int id;
    public final double arrivalTime;
    public double leaveTime;
    public boolean isEatIn;

    public Customer(double arrivalTime, boolean isEatIn) {
        id = nextId++;
        leaveTime = arrivalTime;
        this.arrivalTime = arrivalTime;
        this.isEatIn = isEatIn;
    }

    public void addTime(double time) {
        this.leaveTime += time;
    }

    public double totalTime() {
        return leaveTime - arrivalTime;
    }
}