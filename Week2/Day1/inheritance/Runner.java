package Week2.Day1.inheritance;

public class Runner {

    public static void main(String[] args) {
        // HomeAppliance homeApp1 = new HomeAppliance("TUSHIBA", 2001);

        // HomeAppliance homeApp2 = new HomeAppliance("Tushiba", 222);

        Television tv1 = new Television("TUSHIBA", 2001, 6.7f);
        tv1.setModel("G45");

        Television tv2 = new Television("Panasonic", 111, 1f);
        tv2.setModel("3333");

        tv1.display();
        tv2.display();

        int res = tv1.isBigger(tv2);
        String resultText = "the same as";
        if (res == 1) {
            resultText = "bigger than";
        } else if (res == -1) {
            resultText = "smaller than";
        }
        System.out.println("TV1 is " + resultText + " TV2");
    }
}
