import java.util.Scanner;
 
public class NounInput {
    public String getWord(Scanner input)
    {
        System.out.print("Enter a noun: ");
        String word = input.nextLine();
        return word;
    }
};
