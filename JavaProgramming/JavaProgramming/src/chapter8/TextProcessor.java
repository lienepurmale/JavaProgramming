package chapter8;

public class TextProcessor {

    public static void main(String args[]) {
        countWords("I love Test automation");
        reverseString("Hello Test Automation");
        addSpaces("HelloWorld!ItIsLiene");

    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numWords = words.length;

        String message = String.format("Your text contains %d words:", numWords);
        System.out.println(message);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     */
    public static void reverseString(String reverse) {
        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.charAt(i));
        }
        System.out.println();
    }

    /**
     * Adds spaces before each uppercase letter
     */
    public static void addSpaces(String spaces) {
        var modifiedText = new StringBuilder(spaces);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
