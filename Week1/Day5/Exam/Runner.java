package Week1.Day5.Exam;

public class Runner {
    /**
     * Question 1
     * 
     * JRE - Is the java runtime environment which provides the
     * minimum closed environment that will allow Java program to run.
     * 
     * JDK - Is the software development kit for developing Java applications
     * it includes the JRE, complier, javadoc and other tools.
     * 
     * JVM - Is the java virtual machine for executing bytecode, .class files
     * are in bytecode so, JVM can execute them.
     */

    /**
     * Question 2
     *
     * 1) Writing the code - first the code is writing in java language
     * 
     * 2) Java compiler - the code will go through the java compiler and will be
     * converted to Bytecode (machine code) (.class is writting in Byecode).
     * 
     * 3) Java Virtual Machine will execute the code
     * 
     * 4) Output or a running application
     */

    public static void main(String[] args) {
        int palindromeNumber1 = 2552;
        int palindromeNumber2 = 25552;
        int notPalindromeNumber = 2652;
        System.out.println(isPalindrome(palindromeNumber1));
        System.out.println(isPalindrome(palindromeNumber2));
        System.out.println(isPalindrome(notPalindromeNumber));
        int[] firstArray = { 7, 8, -4 };
        int[] secondArray = { -5, 7, 3, 2 };
        int[] concatArray = concatArrysAndAddSumAbsSub(firstArray, secondArray);
        for (int i = 0; i < concatArray.length; i++) {
            System.out.print(concatArray[i] + " ");
        }
    }

    /**
     * Question 3
     * 
     * @param number
     * @return - is the number a palindrome?
     */
    public static boolean isPalindrome(int number) {
        int originalNum = number, remainder, reversedNum = 0;
        while (number > 0) {
            remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }
        return originalNum == reversedNum ? true : false;
    }

    /**
     * Question 4
     * 
     * @param array1
     * @param array2
     * @return - returns an array initialized with the array that has
     *         the smaller sum of elements first and followed by the other array.
     *         followed by 2 elements which is the total sum of the
     *         two arrays and absolute difference between the sum of each array.
     */
    public static int[] concatArrysAndAddSumAbsSub(int[] array1, int[] array2) {
        int[] smallestSumArray = array1, biggestSumArray = array2;
        int lengthReturnedArray = smallestSumArray.length + biggestSumArray.length + 2;
        int[] returnedArray = new int[lengthReturnedArray];
        int sumSmallestArray = 0, sumBiggestArray = 0;
        for (int i = 0, j = 0; i < smallestSumArray.length || j < biggestSumArray.length; i++, j++) {
            if (i < smallestSumArray.length) {
                sumSmallestArray += smallestSumArray[i];
            }
            if (j < biggestSumArray.length) {
                sumBiggestArray += biggestSumArray[i];
            }
        }
        if (sumSmallestArray > sumBiggestArray) {
            smallestSumArray = array2;
            biggestSumArray = array1;
        }
        int j = 0;
        for (int i = 0; i < returnedArray.length - 2; i++) {
            if (i < smallestSumArray.length) {
                returnedArray[i] = smallestSumArray[i];
            } else {
                returnedArray[i] = biggestSumArray[j];
                j++;
            }
        }
        returnedArray[returnedArray.length - 2] = sumBiggestArray + sumSmallestArray;
        returnedArray[returnedArray.length - 1] = Math.abs(sumBiggestArray - sumSmallestArray);
        return returnedArray;
    }
}
