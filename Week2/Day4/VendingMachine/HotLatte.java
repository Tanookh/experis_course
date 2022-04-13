package Week2.Day4.VendingMachine;

public class HotLatte extends CoffeeBased {

    private final static int volume = 150;
    private final float sugar = 2;
    private final static double temperature = 80;
    private final static double price = 12;
    private final boolean milkBased = true;

    public HotLatte() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that a Hot Latte is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Hot Latte");
        super.produce();
        System.out.println("Hot Latte");
    }
}
