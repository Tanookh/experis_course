package Week2.Day4.VendingMachine;

public class OrangeJuice extends SoftDrink {

    private final static int volume = 200;
    private final static double temperature = 80;
    private final static double price = 12;

    public OrangeJuice() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that an Orange Juice is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Orange Juice");
        super.produce();
        System.out.println("Orange Juice");
    }
}
