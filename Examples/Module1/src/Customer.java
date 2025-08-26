public class Customer {
    private int  id; //32 bits
    private long timeStart; //64 bits
    private long timeEnd;
    private static int _id = 1;

    private Customer() {
        this.id = _id++;
    }

    public int getId() {
        return id;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public long getTimeEnd() {
        return timeEnd;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }

    //returns time in seconds
    public double timeSpent() {
        return (timeEnd - timeStart)/1000.0;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer2 = new Customer();

        //Customer entering system
        customer.setTimeStart(System.currentTimeMillis());
        customer2.setTimeEnd(System.currentTimeMillis());

        //waiting for 1 sec
        try {
            Thread.sleep(1000);  // 1000 ms = 1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //customer is ready
        customer.setTimeEnd(System.currentTimeMillis());
        customer2.setTimeStart(System.currentTimeMillis());

        System.out.println("Customer " + customer.getId() + " servicing time: " + customer.timeSpent() + "s");
    }
}
