package Week2.Day1.inheritance;

import java.util.Calendar;

import Week2.Day2.inheritance.RemoteControl;

public class Television extends HomeAppliance implements Flatable, Smartable {
    protected float size;
    protected String model;
    private RemoteControl remoteControl;

    public Television(String manufacturer, int purchaseYear, float size, String transmitMethod, int powerConsumption) {
        super(manufacturer, purchaseYear, powerConsumption);
        setManufacturer(manufacturer);
        setPurchaseYear(purchaseYear);
        remoteControl = new RemoteControl(transmitMethod);
        setSize(size);
        setModel("A12");
    }

    public Television(String manufacturer, int purchaseYear, float size, int powerConsumption) {
        super(manufacturer, purchaseYear, powerConsumption);
        setManufacturer(manufacturer);
        setPurchaseYear(purchaseYear);
        remoteControl = new RemoteControl();
        setSize(size);
        setModel("A12");
    }

    public Television(float size) {
        this("Generic", (Calendar.getInstance().get(Calendar.YEAR)), size, 400);
    }

    public Television() {
        this(40);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() < 3) {
            System.out.println("Exception in setModel");
            return;
        }

        char ch = model.charAt(0);
        if (!Character.isLetter(ch))
            model = "A" + model;

        char ch1 = model.charAt(1);
        char ch2 = model.charAt(2);
        if (!Character.isDigit(ch1) || !Character.isDigit(ch2)) {
            model = ch + "00";
        }

        model = model.substring(0, 3);
        this.model = model;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        if (size < 2.5f || size > 120f) {
            this.size = 10f;
        } else {
            this.size = size;
        }
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg = msg + "Television size :" + size + ", model: " + model + ", remote control transmot method is : "
                + remoteControl.getTransmitMethod();
        return msg;
    }

    public float sizeInCM() {
        return (float) (size * 2.54);
    }

    public int isBigger(Television other) {
        float diff = this.size - other.size;
        if (diff == 0) {
            return 0;
        }
        return diff < 0 ? -1 : 1;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public int getPowerConsumption(int hours) {
        return hours * powerConsumption;
    }

    @Override
    public boolean isFlat() {
        return purchaseYear > 2010 ? true : false;
    }

    @Override
    public boolean isSmart() {
        return purchaseYear > 2010 ? true : false;
    }

}
