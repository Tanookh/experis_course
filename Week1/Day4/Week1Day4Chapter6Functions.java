import java.util.Random;

//import java.util.Scanner;

public class Week1Day4Chapter6Functions {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int number1 = 939;
        // int number2 = 262;
        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();
        // int num3 = scanner.nextInt();
        // printAvg(grade1, grade2, grade3);
        // System.out.println(find_max(num1, num2, num3));
        // System.out.println(find_max(5, 32, 64));
        // System.out.println(find_max(5, 23));
        // System.out.println(increaseDigitByOne(number));
        // System.out.println(TakeSmallestDigit(number1, number2));
        // System.out.println(isPerfect(28));
        // int[] array = { 91, 82, 55 , 44};
        // System.out.println(checkArrayNumbersDigitsIs10(array, 3));
        // printDiamond('#', 8);
        // int[][] array = { {2, 1, 5},
        // {6, 7, 3},
        // {0, 8, 0} };
        // System.out.println(checkRowEqualCol(array, 3));

        // int[][] array1 = { {2, 1, 5, 1, 2},
        // {6, 7, 3, 7, 6},
        // {0, 8, 0, 8, 0} };
        //
        // int[][] array2 = { {2, 1, 5, 5, 1, 2},
        // {6, 7, 3, 3, 7, 6},
        // {0, 8, 0, 0, 8, 0} };
        // System.out.println(mirrorMatrix(array2));

        // String[] array1 = { "8", "0" };
        //
        // String[] array2 = { "9", "3", "6", "2", "5" };
        //
        // sumStringNumbers(array1, array2);

        // scanner.close();

        // System.out.println(10 * Math.sin(Math.PI/4));
        // System.out.println(Math.toRadians(120));
        // System.out.println(Math.pow(Math.E,2.5));

        // int[] array1 = buildRandomArray(3);
        // int[] array2 = buildRandomArray(4);
        // for (int i = 0; i < array1.length; i++) {
        // System.out.print(array1[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < array2.length; i++) {
        // System.out.print(array2[i] + " ");
        // }
        // System.out.println();
        // returnSumOfTwoArraysInOneArray(array1, array2);
        // System.out.println();
        // for (int i = 0; i < array2.length; i++) {
        // System.out.print(array2[i] + " ");
        // }
        // System.out.println();

        // int[][] array2 = { { 0, 0, 0, 5, 1, 2 },
        // { 0, 0, 0, 3, 7, 6 },
        // { 0, 0, 0, 0, 8, 0 },
        // { 0, 8, 0, 0, 8, 0 } };
        // System.out.println(max0Rectangle(array2));
    }

    public static void printAvg(int grade1, int grade2, int grade3) {
        double sum = grade1 + grade2 + grade3;
        System.out.println(sum / 3);
    }

    public static int find_max(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > num3 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num1) {
            max = num3;
        }
        return max;
    }

    public static int find_max(int num1, int num2) {
        if (num2 > num1) {
            return num2;
        }
        return num1;
    }

    // Presentation excersice1
    public static int[] buildRandomArray(int length) {
        int[] newRandomArray = new int[length];
        // Random rand = new Random();
        for (int i = 0; i < length; i++) {
            newRandomArray[i] = (int) (Math.random() * 201) - 100;
        }
        return newRandomArray;
    }

    // Presentation excersice2
    public static void returnSumOfTwoArraysInOneArray(int[] firstArray, int[] secondArray) {
        int[] longArr = firstArray, shortArr = secondArray;
        if (longArr.length < shortArr.length) {
            longArr = secondArray;
            shortArr = firstArray;
        }
        putArraySumInLongerArray(longArr, shortArr);
    }

    // Presentation excersice2
    public static void putArraySumInLongerArray(int[] longArr, int[] shortArr) {
        int i;
        for (i = 0; i < shortArr.length; i++) {
            longArr[i] += shortArr[i];
        }
    }

    // Question 1
    public static int increaseDigitByOne(int number) {
        String stringNumber = String.valueOf(number);
        String returnNumber = "";
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '9') {
                returnNumber = returnNumber + '0';
            } else {
                returnNumber = returnNumber + (Integer.parseInt(stringNumber.substring(i, i + 1)) + 1);
            }
        }
        return Integer.parseInt(returnNumber);
    }

    // Question 2
    public static int TakeSmallestDigit(int num1, int num2) {
        String num1String = String.valueOf(num1);
        String num2String = String.valueOf(num2);
        if (num1String.length() != num2String.length()) {
            return -1;
        }
        String returnString = "";
        for (int i = 0; i < num1String.length(); i++) {
            if (num1String.charAt(i) < num2String.charAt(i)) {
                returnString = returnString + num1String.charAt(i);
            } else {
                returnString = returnString + num2String.charAt(i);
            }
        }
        return Integer.valueOf(returnString);
    }

    // Question 3
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    // Question 4a
    public static int returnSumOfDigits(int number) {
        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    // Question 4b
    public static int checkArrayNumbersDigitsIs10(int[] array, int length) {
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (returnSumOfDigits(array[i]) == 10) {
                counter++;
            }
        }
        return counter;
    }

    // Question 5
    public static void printDiamond(char tav, int number) {
        int staticNumber = number;
        while (number > 0) {
            for (int i = 0; i < number / 2; i++) {
                System.out.print(tav);
            }
            for (int j = staticNumber - number; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < number / 2; k++) {
                System.out.print(tav);
            }
            if (number != 2) {
                System.out.println();
            }
            number = number - 2;
        }
        while (number <= staticNumber) {
            for (int i = 0; i < number / 2; i++) {
                System.out.print(tav);
            }
            for (int j = staticNumber - number; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < number / 2; k++) {
                System.out.print(tav);
            }
            System.out.println();
            number = number + 2;
        }
    }

    // Question 6
    public static boolean checkRowEqualCol(int[][] matrix, int n) {
        int i, k = 0;
        int sumRow = 0, sumCol = 0;
        while (k < n) {
            for (i = 0; i < n; i++) {
                sumRow += matrix[i][k];
            }
            for (i = 0; i < n; i++) {
                sumCol += matrix[k][i];
            }
            if (sumRow != sumCol) {
                return false;
            }
            sumRow = 0;
            sumCol = 0;
            k++;
        }
        return true;
    }

    // Question 7
    public static boolean mirrorMatrix(int[][] matrix) {
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length / 2; m++) {
                if (matrix[n][m] != matrix[n][matrix[n].length - m - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Question 8
    public static void sumStringNumbers(String[] number1, String[] number2) {
        String[] sumString;
        int carry = 0;
        String[] longArr = number1;
        String[] shortArr = number2;

        if (number1.length > number2.length) {
            sumString = new String[number1.length + 1];
        } else {
            sumString = new String[number2.length + 1];
            longArr = number2;
            shortArr = number1;
        }
        int temp;
        int i;
        for (i = 0; i < shortArr.length; i++) {
            temp = Integer.valueOf(longArr[longArr.length - 1 - i])
                    + Integer.valueOf(shortArr[shortArr.length - 1 - i]);
            if (temp < 10 && carry == 0) {
                sumString[sumString.length - 1 - i] = String.valueOf(temp);
            } else if (temp < 9 && carry == 1) {
                temp++;
                sumString[sumString.length - 1 - i] = String.valueOf(temp);
                carry = 0;
            } else if (temp == 9 && carry == 1) {
                sumString[sumString.length - 1 - i] = "0";
            } else if (temp > 9) {
                carry = 1;
                temp -= 10;
                sumString[sumString.length - 1 - i] = String.valueOf(temp);
            }
        }
        for (; i < longArr.length; i++) {
            if (carry == 0) {
                sumString[sumString.length - 1 - i] = longArr[longArr.length - 1 - i];
            } else if (longArr[longArr.length - 1 - i] == "9" && carry == 1) {
                sumString[sumString.length - 1 - i] = "0";
            } else {
                temp = Integer.valueOf(longArr[longArr.length - 1 - i]) + 1;
                sumString[sumString.length - 1 - i] = String.valueOf(temp);
                carry = 0;
            }
        }
        if (carry == 1) {
            sumString[0] = "1";
        } else {
            sumString[0] = "0";
        }
        for (int j = 0; j < sumString.length; j++) {
            System.out.print(sumString[j]);
        }
    }

    // Question 9
    public static int max0Rectangle(int[][] matrix) {
        int zero_rectangle = 0;
        int j, i;
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 0) {
                for (j = i; j >= 0; j--) {
                    if (matrix[i][j] == 0 && matrix[j][i] == 0 && j == 0) {
                        zero_rectangle++;
                    } else if (matrix[i][j] != 0 || matrix[j][i] != 0) {
                        return zero_rectangle;
                    }
                }
            } else {
                return zero_rectangle;
            }
        }
        return zero_rectangle;
    }

    // Question 11

}