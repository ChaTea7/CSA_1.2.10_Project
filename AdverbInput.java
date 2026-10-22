import java.util.Scanner;

// AdverbInput: asks the user for an adverb and returns it
public class AdverbInput
{
    public String getWord(Scanner input)
    {
        System.out.print("Enter an adverb: ");
        String word = input.nextLine();
        return word;
    }
}
