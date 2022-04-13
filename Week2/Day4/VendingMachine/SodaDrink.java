package Week2.Day4.VendingMachine;

public abstract class SodaDrink extends ColdDrink {
    public boolean isBottle;

    public SodaDrink(int volume, double temperature, double price) {
        super(volume, temperature, price);
    }

}
