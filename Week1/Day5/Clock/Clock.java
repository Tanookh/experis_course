package Week1.Day5.Clock;

public class Clock {

    private int timeInMin;

    public Clock(int timeInMin) {
        this.timeInMin = timeInMin;
    }

    public Clock() {
    }

    public void printTime() {
        int hours = timeInMin / 60;
        int minutes = timeInMin % 60;
        System.out.printf("%02d:%02d\n", hours, minutes);
    }
}
