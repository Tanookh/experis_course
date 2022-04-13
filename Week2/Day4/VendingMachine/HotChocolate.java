package Week2.Day4.VendingMachine;

public class HotChocolate extends ChocolateBased {
    private final static int volume = 200;
    private final float sugar = 2;
    private final static double temperature = 80;
    private final static double price = 12;
    private final boolean milkBased = true;

    public HotChocolate() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that a Hot Chocolate is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Hot Chocolate");
        super.produce();
        System.out.println("Hot Chocolate");
    }

}
