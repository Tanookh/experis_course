package Week2.Day1.inheritance;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public abstract class HomeAppliance implements Appliable {
    protected String manufacturer;
    protected int purchaseYear;
    protected int powerConsumption = 200;
    protected boolean turnedOn = false;
    protected LocalTime timeTurnedOn;

    public HomeAppliance(String manufacturer, int purchaseYear, int powerConsumption) {
        setManufacturer(manufacturer);
        setPurchaseYear(purchaseYear);
        setPowerConsumption(powerConsumption);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer != null) {
            this.manufacturer = manufacturer.toUpperCase();
        }

    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if (purchaseYear > 1990 && purchaseYear <= currYear) {
            this.purchaseYear = purchaseYear;
        } else {
            this.purchaseYear = currYear;
        }
    }

    @Override
    public String toString() {
        String msg = "Manufacturer: " + manufacturer + ", Purchase year: " + purchaseYear + ", power consumption: "
                + powerConsumption;
        return msg;
    }

    abstract int getPowerConsumption(int hours);

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public LocalTime turnOn() {
        turnedOn = true;
        timeTurnedOn = LocalTime.now();
        System.out.println("turned on");
        return timeTurnedOn;
    }

    @Override
    public long turnOffSec(LocalTime on) {
        this.turnedOn = false;
        long timeTurnedOff = LocalTime.now().toSecondOfDay();
        System.out.println("turned off");
        System.out.println(
                ((timeTurnedOff - timeTurnedOn.toSecondOfDay())
                        + " seconds has passed since turned on"));
        return (LocalTime.now().toSecondOfDay() - timeTurnedOn.toSecondOfDay());

    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public LocalTime getTimeTurnedOn() {
        return timeTurnedOn;
    }

    public void setTimeTurnedOn(LocalTime timeTurnedOn) {
        this.timeTurnedOn = timeTurnedOn;
    }
}
