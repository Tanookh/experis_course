package Week2.Day4.VendingMachine;

public class Sprite extends SodaDrink {

    private final static int volume = 200;
    private final static double temperature = 80;
    private final static double price = 12;

    public Sprite() {
        super(volume, temperature, price);
    }

    /**
     * This function shows the user that a Sprite is being made
     */
    @Override
    public void produce() {
        System.out.println("Producing Sprite");
        super.produce();
        System.out.println("Sprite");
    }
}
