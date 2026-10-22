import java.util.Scanner;
//takes a noun input and gives to the main file
public class NounInput {
    public String getWord(Scanner input)
    {
        System.out.print("Enter a noun: ");
        String word = input.nextLine();
        return word;
    }
};
