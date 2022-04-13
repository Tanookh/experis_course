package Week2.Day4.VendingMachine;

public class HotCappuccino extends CoffeeBased {

    private final static int volume = 100;
    private final float sugar = 2;
    private final static double temperature = 80;
    private final static double price = 12;
    private final boolean milkBased = true;

    public HotCappuccino() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that a Hot Cappuccino is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Hot Cappuccino");
        super.produce();
        System.out.println("Hot Cappuccino");
    }

}
