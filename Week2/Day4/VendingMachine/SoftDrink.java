package Week2.Day4.VendingMachine;

public abstract class SoftDrink extends ColdDrink {
    protected boolean isSqueezed;

    public SoftDrink(int volume, double temperature, double price) {
        super(volume, temperature, price);
    }
}
