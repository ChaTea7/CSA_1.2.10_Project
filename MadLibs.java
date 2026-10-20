import java.util.Scanner;

public class MadLibs {
    public static void main (String[] args) {
        //initialize the scanner
        Scanner scanner = new Scanner(System.in);

        //Alex's madlib
        //take string inputs 
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a location: ");
        String location = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        //concatenates strings together
        String template = name + " went to the " + location + " in order to " + verb + ".";
        System.out.println(template);


        //close the scanner
        scanner.close();
    }
}