package Week2.Day4.VendingMachine;

public class HotEspresso extends CoffeeBased {

    private final static int volume = 50;
    private final float sugar = 2;
    private final static double temperature = 80;
    private final static double price = 12;
    private final boolean milkBased = true;

    public HotEspresso() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that a Hot Espresso is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Hot Espresso");
        super.produce();
        System.out.println("Hot Espresso");
    }
}
