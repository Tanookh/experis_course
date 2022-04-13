package Week2.Day4.VendingMachine;

import java.util.Scanner;

public class VendingMachine {
  public static int milkQtt;
  public static int waterQtt;

  static {
    milkQtt = 1000;
    waterQtt = 2000;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (milkQtt != -1 && waterQtt != -1) {
      showMenu();
      int opt = Integer.parseInt(sc.next());
      if (opt == 0)
        break;
      Produceable drink = createDrink(opt);
      drink.produce();
      System.out.println();
    }
    sc.close();
  }

  private static Produceable createDrink(int opt) {
    Produceable drink;
    switch (opt) {
      case 0:
        System.out.println("Bye Bye");
        return null;
      case 1: {
        return drink = new HotChocolate();
      }
      case 2: {
        return drink = new HotEspresso();
      }
      case 3: {
        return drink = new HotCappuccino();
      }
      case 4: {
        return drink = new HotLatte();
      }
      case 5: {
        return drink = new Cola();
      }
      case 6: {
        return drink = new Sprite();
      }
      case 7: {
        return drink = new OrangeJuice();
      }
      case 8: {
        return drink = new AppleJuice();
      }
    }
    return null;
  }

  public static void showMenu() {
    System.out.println("Please select a drink or enter 0 to exit:");
    System.out.println("1. Hot Chocolate\n" + "2. Hot Espresso\n" + "3. Hot Cappuccino\n" + "4. Hot Latte\n"
        + "5. Cola\n" + "6. Sprite\n" + "7. Orange Juice\n" + "8. Apple Juice");
  }
}