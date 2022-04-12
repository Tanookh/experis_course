package Week2.Day2.Polymorphism;

public class PizzaDelivery extends Delivery {
    protected String[] description;
    protected float bill;

    public PizzaDelivery(String clientName, String address, String[] description, float bill) {
        super(clientName, address);
        this.description = new String[description.length];
        for (int i = 0; i < description.length; i++) {
            this.description[i] = new String(description[i]);
        }
        this.bill = bill;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg += "Total of " + description.length + " pizzas:\n";
        // msg += String.format("Total of %d pizzas:\n", description.length);
        for (String desc : description) {
            // msg += String.format("%s\n", desc);
            msg += desc + "\n";
        }
        msg += "Your total bill is: " + bill;
        return msg;
    }

    public void deliver() {
        System.out.println("----------------");
        System.out.println("Hi I have a pizza ");
        System.out.println(this);
        System.out.println("----------------");
    }

}
