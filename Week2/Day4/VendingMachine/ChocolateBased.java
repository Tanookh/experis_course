package Week2.Day4.VendingMachine;

public abstract class ChocolateBased extends HotDrink {
    protected boolean milkBased;

    public ChocolateBased(int volume, double temperature, double price) {
        super(volume, temperature, price);
    }

}
