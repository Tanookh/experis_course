public class Week1Day3 {

    // Question 16 Chapter 4
    public static void main(String[] args) {
        int i, j;
        int counter = 0;
        int firstDivisorSum = 0, secondDivisorSum = 0;
        for (i = 0; i < 100000; i++) {
            for (j = 0; j < i; j++) {
                for (int k = 1; k < i; k++) {
                    if (i % k == 0) {
                        firstDivisorSum = firstDivisorSum + k;
                    }
                }
                for (int k = 1; k < j; k++) {
                    if (j % k == 0) {
                        secondDivisorSum = secondDivisorSum + k;
                    }
                }
                if ((i == secondDivisorSum) && (j == firstDivisorSum)) {
                    System.out.println(i + ", " + j + " are amicable numbers.");
                    if (counter == 10) {
                        return;
                    }
                    counter++;
                }
            }
        }
    }
}
