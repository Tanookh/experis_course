package Week2.Day2.Polymorphism;

public class Delivery {
    private static long counter = 0;
    protected String clientName;
    protected String address;
    protected final long ID;

    public Delivery(String clientName, String address) {
        this.clientName = clientName;
        this.address = address;
        this.ID = counter++;
    }

    @Override
    public String toString() {
        return "Hi I have a delivery number #" + ID + " for " + clientName + " at " + address;
    }

    public void deliver() {
        System.out.println(toString());
    }
}
