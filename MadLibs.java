import java.util.Scanner;

public class MadLibs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("He was forced to " + adverb + " run away, scared for his life.");
        
        //Alex's madlib
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a location: ");
        String location = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        String template = name + " went to the " + location + " in order to " + verb + ".";
        System.out.println(template);



        scanner.close();
    }
}