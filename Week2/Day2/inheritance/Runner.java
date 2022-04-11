package Week2.Day2.inheritance;

//import Week2.Day1.inheritance.HomeAppliance;
import Week2.Day1.inheritance.Television;

public class Runner {

    public static void main(String[] args) {
        // HomeAppliance homeApp1 = new HomeAppliance("TUSHIBA", 2001);

        // HomeAppliance homeApp2 = new HomeAppliance("Tushiba", 222);

        // System.out.println(homeApp1);
        // System.out.println(homeApp2);

        Television tv1 = new Television("TUSHIBA", 2001, 6.7f, "FI", 200);
        tv1.setModel("G45");

        Television tv2 = new Television("Panasonic", 111, 1f, 400);
        tv2.setModel("3333");

        System.out.println(tv1);
        System.out.println(tv2);

        int res = tv1.isBigger(tv2);
        String resultText = "the same as";
        if (res == 1) {
            resultText = "bigger than";
        } else if (res == -1) {
            resultText = "smaller than";
        }
        System.out.println("TV1 is " + resultText + " TV2");

        System.out.println("TV1 power consumption for 3 hours is: " + tv1.getPowerConsumption(3));

        tv1.turnOn();
        long timeInSeconds = tv1.turnOffSec(tv1.getTimeTurnedOn());
        System.out.println(tv1.isSmart());
        System.out.println(tv1.isFlat());
        System.out.println(tv2.isSmart());
        System.out.println(tv2.isFlat());
    }
}
