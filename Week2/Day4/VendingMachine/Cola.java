package Week2.Day4.VendingMachine;

public class Cola extends SodaDrink {

    private final static int volume = 200;
    private final static double temperature = 80;
    private final static double price = 12;

    public Cola() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that a Cola is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Cola");
        super.produce();
        System.out.println("Cola");
    }
}
