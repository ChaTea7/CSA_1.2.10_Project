import java.util.Scanner;
// asks the user for a plural noun and returns it
public class PluralNounInput {
    public String getWord(Scanner input)
    {
        System.out.print("Enter a plural noun: ");
        String word = input.nextLine();
        return word;
    }
}
