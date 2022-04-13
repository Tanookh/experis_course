package Week2.Day4.VendingMachine;

public abstract class ColdDrink extends Drink {
    protected String mainIngredient;

    public ColdDrink(int volume, double temperature, double price) {
        super(volume, temperature, price);
    }

    /**
     * This function checks if an a Cold Drink can be made
     * if it can be made it will reduce the volume from the waterQtt
     */
    @Override
    public void produce() {
        if (VendingMachine.waterQtt - volume < 0) {
            System.out.print("Cant produce ");
            VendingMachine.waterQtt = -1;
        } else {
            VendingMachine.waterQtt -= volume;
            super.produce();
        }
    }

}
