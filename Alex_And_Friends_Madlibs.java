import java.util.Scanner;

// Collects one word from each teammate's class and joins them into one Mad Lib sentence
public class Alex_And_Friends_Madlibs
{
    public static void main(String[] args)
    {
        // One Scanner shared by every input class
        Scanner input = new Scanner(System.in);

        // Create one object from each teammate's file
        AdjectiveInput adjectiveInput = new AdjectiveInput();
        NounInput nounInput = new NounInput();
        VerbInput verbInput = new VerbInput();
        AdverbInput adverbInput = new AdverbInput();
        PluralNounInput pluralNounInput = new PluralNounInput();

        // Get one word from each object
        String adjective = adjectiveInput.getWord(input);
        String noun = nounInput.getWord(input);
        String verb = verbInput.getWord(input);
        String adverb = adverbInput.getWord(input);
        String pluralNoun = pluralNounInput.getWord(input);

        // Concatenate the words into the story
        String story = "The " + adjective + " " + noun + " " + verb + " "
                + adverb + " across the pond to eat some " + pluralNoun + ".";

        // Print the finished Mad Lib
        System.out.println();
        System.out.println(story);
    }
}
