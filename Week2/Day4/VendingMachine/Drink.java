package Week2.Day4.VendingMachine;

public abstract class Drink implements Produceable {
    protected int volume;
    protected double temperature;
    protected double price;

    public Drink(int volume, double temperature, double price) {
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    /**
     * This function shows the user the Drink's details.
     * 
     */
    @Override
    public void produce() {
        System.out.println("temperature: " + temperature + ", price: " + price);
        System.out.print("Enjoy your ");
    }

}
