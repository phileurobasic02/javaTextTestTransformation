import transformations.Transformations;

public class StringOperations {
    public static void main(String[] args) {
        String text = "hello, world!";

        String capitalizedText = Transformations.capitalize(text);
        System.out.println("Capitalized text: " + capitalizedText);

        String reversedText = Transformations.reverse(text);
        System.out.println("Reversed text: " + reversedText);
    }
}
