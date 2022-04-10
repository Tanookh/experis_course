package Week2.Day1.stringMenu;

import java.util.Scanner;

public class Runner {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int menuInput;
        do {
            printMenu();
            menuInput = Integer.parseInt(getUserInputByMsg("Pick your selection: "));
            switch (menuInput) {
                case 1:
                    question1Handler();
                    System.out.println();
                    break;
                case 2:
                    question2Handler();
                    System.out.println();
                    break;
                case 3:
                    question3Handler();
                    System.out.println();
                    break;
                case 4:
                    question4Handler();
                    System.out.println();
                    break;
                case 5:
                    question5Handler();
                    System.out.println();
                    break;
                case 6:
                    question6Handler();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid number: ");
            }
        } while (menuInput != 7);
        scan.close();
    }

    public static String getUserInputByMsg(String msg) {
        System.out.println(msg);
        String returnString = scan.nextLine();
        return returnString;
    }

    public static void printMenu() {
        String menuText = "Please enter the number of your selection from the following options:\r\n";
        menuText += "1. Enter 2 sentences and I'll tell you if one is the other written backwards.\r\n";
        menuText += "2. Enter a word and I'll tell you if it is a palindrome.\r\n";
        menuText += "3. Enter a sentence and a word and I'll remove that word from anywhere in the sentence for you.\r\n";
        menuText += "4. Enter a sentence and I'll capitalize the beginning of each word in it.\r\n";
        menuText += "5. Enter a sentence and 2 words and I'll replace that first word  with the second from everywhere in the sentence for you.\r\n";
        menuText += "6. Enter a sentence and a letter and I'll print all the words that start with that letter.\r\n";
        menuText += "7. Exit\r\n";
        System.out.println(menuText);
    }

    public static void question1Handler() {
        String firstSentence = getUserInputByMsg("Enter the first sentence: ");
        String secondSentence = getUserInputByMsg("Enter the second sentence: ");
        String printString = "The sentences are not written front to back";
        if (isWrittenBackWards(firstSentence, secondSentence)) {
            printString = "The sentences are written front to back";
        }
        System.out.println(printString);
    }

    /**
     * 
     * @param firstSentence
     * @param secondSentence
     * @return if the second sentence is the same as the first sentence but is
     *         written backwards
     */
    private static boolean isWrittenBackWards(String firstSentence, String secondSentence) {

        if (firstSentence.length() == secondSentence.length()) {
            String[] firstSentenceSplit = firstSentence.split(" ");
            String reverseFirstSentence = "";
            for (int i = firstSentenceSplit.length - 1; i >= 0; i--) {
                reverseFirstSentence += firstSentenceSplit[i];
                if (i != 0) {
                    reverseFirstSentence += " ";
                }
            }
            if (reverseFirstSentence.equals(secondSentence)) {
                return true;
            }
        }
        return false;
    }

    public static void question2Handler() {
        String word;
        word = getUserInputByMsg("Enter the word: ");
        String printString = "The word is not palindrome";
        if (isPalindrome(word)) {
            printString = "The word is palindrome";
        }
        System.out.println(printString);
    }

    /**
     * 
     * @param word
     * @return if the word is palindrome
     */
    private static boolean isPalindrome(String word) {
        int end = word.length() - 1;
        int start = 0;
        while (end > start) {
            if (word.charAt(end--) != word.charAt(start++)) {
                return false;
            }
        }
        return true;
    }

    public static void question3Handler() {
        String sentence;
        String word;
        sentence = getUserInputByMsg("Enter the sentence: ");
        word = getUserInputByMsg("Enter the word: ");
        removeWordFromSentence(sentence, word);
    }

    /**
     * 
     * @param sentence
     * @param word
     *                 removes the word from the sentence and prints the sentence
     */
    private static void removeWordFromSentence(String sentence, String word) {
        System.out.println(sentence.replace(word, ""));
    }

    public static void question4Handler() {
        String sentence;
        sentence = getUserInputByMsg("Enter the sentence: ");
        capitalizeTheBeginningOfWords(sentence);
    }

    /**
     * 
     * @param sentence
     *                 capitalize every beginning of words in the sentence
     */
    private static void capitalizeTheBeginningOfWords(String sentence) {
        String[] sentenceSplit = sentence.split(" ");
        String word = "";
        for (int i = 0; i < sentenceSplit.length; i++) {
            word = sentenceSplit[i].substring(0, 1).toUpperCase() + sentenceSplit[i].substring(1);
            sentenceSplit[i] = word;
        }
        for (int i = 0; i < sentenceSplit.length; i++) {
            System.out.print(sentenceSplit[i] + " ");
        }
    }

    public static void question5Handler() {
        String sentence;
        sentence = getUserInputByMsg("Enter the sentence: ");
        String firstWord;
        firstWord = getUserInputByMsg("Enter the target word: ");
        String secondWord;
        secondWord = getUserInputByMsg("Enter the replacement word: ");
        replaceFirstWordWithSecondWord(sentence, firstWord, secondWord);
    }

    /**
     * 
     * @param sentence
     * @param firstWord
     * @param secondWord
     *                   replaces the first word with the second word in the
     *                   sentence and prints the sentence
     */
    private static void replaceFirstWordWithSecondWord(String sentence, String firstWord, String secondWord) {
        sentence = sentence.replace(firstWord, secondWord);
        System.out.println(sentence);
    }

    public static void question6Handler() {
        String sentence;
        sentence = getUserInputByMsg("Enter the sentence: ");
        String letter;
        letter = getUserInputByMsg("Enter the letter: ");
        printWordsStartingWithLetter(sentence, letter);
    }

    /**
     * 
     * @param sentence
     * @param letter
     *                 prints all the words in the sentence that start with the
     *                 letter
     */
    private static void printWordsStartingWithLetter(String sentence, String letter) {
        String[] sentenceSplit = sentence.split(" ");
        for (int i = 0; i < sentenceSplit.length; i++) {
            if (sentenceSplit[i].substring(0, 1).equals(letter)) {
                System.out.println(sentenceSplit[i]);
            }
        }
    }

}
