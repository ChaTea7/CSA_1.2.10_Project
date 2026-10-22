import java.util.Scanner;

// asking the user for a verb and returning it
public class VerbInput {
    public String getWord(Scanner input) {
        System.out.print("Enter a past tense verb (ex: jumped): ");
        String word = input.nextLine();
        return word;
    }
}
