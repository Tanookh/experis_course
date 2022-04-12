package Week2.Day2.Polymorphism;

public class ParcelDelivery extends Delivery {
    protected int numItems;
    protected boolean isDoorSided;

    public ParcelDelivery(int numItems, boolean isDoorSided, String clientName, String address) {
        super(clientName, address);
        this.numItems = numItems;
        this.isDoorSided = isDoorSided;
    }

    public void deliver() {
        System.out.println("----------------");
        System.out.println("Hi I have a parcel ");
        System.out.println(this);
        System.out.println("----------------");
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg += "Total of " + numItems + " items:\n";
        // msg += String.format("Total of %d items:\n", numItems);
        if (isDoorSided) {
            msg += "I left it for you by the door";
        } else {
            msg += "I would need your signature. Can you please come over?";
        }
        return msg;
    }
}
