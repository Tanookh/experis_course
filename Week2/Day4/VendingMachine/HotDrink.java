package Week2.Day4.VendingMachine;

public abstract class HotDrink extends Drink {
    protected int sugar;

    public HotDrink(int volume, double temperature, double price) {
        super(volume, temperature, price);
    }

    /**
     * This function checks if an a Hot Drink can be made
     * if it can be made it will reduce the volume from the milkQtt
     */
    @Override
    public void produce() {
        if (VendingMachine.milkQtt - volume < 0) {
            System.out.print("Cant produce ");
            VendingMachine.milkQtt = -1;
        } else {
            VendingMachine.milkQtt -= volume;
            super.produce();
        }
    }
}
