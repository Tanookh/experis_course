package Week2.Day4.VendingMachine;

public class AppleJuice extends SoftDrink {

    private final static int volume = 200;
    private final static double temperature = 80;
    private final static double price = 12;

    public AppleJuice() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that an Apple Juice is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Apple Juice");
        super.produce();
        System.out.println("Apple Juice");
    }

}
