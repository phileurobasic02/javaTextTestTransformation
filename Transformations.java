package transformations;

public class Transformations {
    public static String capitalize(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    public static String reverse(String text) {
        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();
        return reversedText.toString();
    }
}
