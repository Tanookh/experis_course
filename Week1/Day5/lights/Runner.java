package Week1.Day5.lights;

public class Runner {

    public static void main(String[] args) {
        Light light1 = new Light(2, true);
        Light light2 = new Light();
        light1.getState();
        System.out.println(light1.getNumOflightBulbs());
        light2.getState();
        System.out.println(light2.getNumOflightBulbs());
        light1.turnOff();

        System.out.println();
        light2.setNumOflightBulbs(10);
        light1.getState();
        System.out.println(light1.getNumOflightBulbs());
        light2.getState();
        System.out.println(light2.getNumOflightBulbs());

        System.out.println();
        light1.turnOn();
        light2.turnOn();
        light1.turnOff();
        light2.turnOff();
    }
}
