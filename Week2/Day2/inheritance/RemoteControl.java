package Week2.Day2.inheritance;

public class RemoteControl {
    private String transmitMethod = "RF";

    public RemoteControl(String transmitMethod) {
        setTransmitMethod(transmitMethod);
    }

    public RemoteControl() {
        this("RF");
    }

    public String getTransmitMethod() {
        return transmitMethod;
    }

    private void setTransmitMethod(String transmitMethod) {
        if (transmitMethod.toUpperCase() == "RF" || transmitMethod.toUpperCase() == "IR") {
            this.transmitMethod = transmitMethod;
        } else {
            this.transmitMethod = "RF";
        }
    }

}
