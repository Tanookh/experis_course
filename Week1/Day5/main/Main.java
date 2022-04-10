package Week1.Day5.main;

public class Main {

    // Questions from presentation
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 6, 7, 8, 9, 10 };
        int[] concatArray;
        concatArray = concatArr(array1, array2);
        printArr(concatArray);
    }

    /**
     * Question from presentation - 1
     * 
     * @param array1 - an array
     * @param b      - an array
     * @return concatArray - concat array array2 with array array1 and return new
     *         array concatArray
     */
    public static int[] concatArr(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] concatArray = new int[length];
        int i, j;
        for (i = 0; i < array1.length; i++) {
            concatArray[i] = array1[i];
        }
        for (j = 0; j < array2.length; i++, j++) {
            concatArray[i] = array2[j];
        }
        return concatArray;
    }

    /**
     * Question from presentation - 1
     * print the array
     * 
     * @param array - an array
     */
    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
