package lights;

public class Light {
    private int numOflightBulbs;
    private boolean isOn;

    public Light(int numOflightBulbs, boolean isOn) {
        this.numOflightBulbs = numOflightBulbs;
        this.isOn = isOn;
    }

    public Light() {
        this(3, true);
    }

    public int getNumOflightBulbs() {
        return numOflightBulbs;
    }

    public void setNumOflightBulbs(int numOflightBulbs) {
        if (numOflightBulbs < 0) {
            System.out.println("Can't put negative lights");
            return;
        }
        this.numOflightBulbs = numOflightBulbs;
        if (numOflightBulbs == 0) {
            turnOff();
        }
    }

    public void getState() {
        String status = isOn ? "on" : "off";
        System.out.println("The light is " + status);

    }

    public void turnOn() {
        if (numOflightBulbs == 0 || isOn) {
            System.out.println("No lights to turn on");
            return;
        }
        this.isOn = true;
        System.out.println("On");
    }

    public void turnOff() {
        if (numOflightBulbs == 0 || !isOn) {
            System.out.println("No lights to turn off");
            return;
        }
        this.isOn = false;
        System.out.println("Off");
    }

    public void toggle(Light light) {
        light.isOn = !light.isOn;
    }

    public void toggle() {
        toggle(this);
    }
}
