package Week2.Day2.Polymorphism;

import java.util.Arrays;

public class PizzaDelivery extends Delivery {
    protected String[] description;
    protected float bill;

    public PizzaDelivery(String clientName, String address, String[] description, float bill, int pizzaCount) {
        super(clientName, address);
        this.description = Arrays.copyOf(description, description.length);
        this.bill = bill;
    }

    @Override
    public String toString() {
        super.toString();
        return "\nTotal of " + description.length + " pizzas: \n" + description + "\nYour total is " + bill;
    }

    public void deliver() {
        System.out.println(toString());
    }

}
