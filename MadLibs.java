import java.util.Scanner;

public class MadLibs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("He was forced to " + adverb + " run away, scared for his life.");
    }
}