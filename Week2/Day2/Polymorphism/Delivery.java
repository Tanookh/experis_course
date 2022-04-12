package Week2.Day2.Polymorphism;

public abstract class Delivery {
    private static long counter = 0;
    protected String clientName;
    protected String address;
    protected final long id;

    public Delivery(String clientName, String address) {
        this.clientName = clientName;
        this.address = address;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "delivery number " + id + " for " + clientName + " at " + address + "\n";
        // return String.format("delivery number %d for %s at %s\n", id, clientName,
        // address);
    }

    public abstract void deliver();

    public void updateAdress(String otherAddress) {
        this.address = otherAddress;
    }
}
