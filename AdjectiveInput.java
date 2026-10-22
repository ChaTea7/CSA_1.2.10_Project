import java.util.Scanner;
//gets an adjective input from scanner
public class AdjectiveInput {
    public String getWord(Scanner input)
    {
        System.out.print("Enter an adjective: ");
        String word = input.nextLine();
        return word;
    }
}
