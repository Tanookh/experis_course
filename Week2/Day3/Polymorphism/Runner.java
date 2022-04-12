package Week2.Day3.Polymorphism;

import java.util.Random;

import Week2.Day2.Polymorphism.ParcelDelivery;
import Week2.Day2.Polymorphism.PizzaDelivery;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Sitting in my home office, I suddenly heard the doorbell.\n"
                + "I wonder who might it be ?");

        PizzaDelivery pizza = new PizzaDelivery("Tanookh", "Israel", new String[] { "a tomato and mushrom",
                "a zukini with extra cheese" },
                120f);

        ParcelDelivery parcel = new ParcelDelivery(2, true, "Tanookh", "Israel");

        Random rand = new Random();
        int opt = rand.nextInt();

        if (opt % 2 == 0) {
            System.out.println("Great it's the pizza guy!");
            pizza.deliver();
        } else {
            parcel.deliver();
            System.out.println("Oh I totally forgot I'd ordered this!");
        }
        System.out.println("Great, thanks a lot");
    }
}
