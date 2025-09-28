import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String AdjectiveOne;
        String NounOne;
        String AdjectiveTwo;
        String VerbOne;
        String AdjectiveThree;

        System.out.print("Enter Adjective (Description): ");
        AdjectiveOne = scanner.nextLine();
        System.out.print("Enter a noun (animal or person):");
        NounOne = scanner.nextLine();
        System.out.print("Enter Adjective (Description): ");
        AdjectiveTwo = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action):");
        VerbOne = scanner.nextLine();
        System.out.print("Enter Adjective (Description): ");
        AdjectiveThree = scanner.nextLine();

        System.out.println("Today I went to a " + AdjectiveOne + "zoo.");
        System.out.println("In a exhibit, I saw a " + NounOne + ".");
        System.out.println(NounOne + "was" + AdjectiveTwo + " and " + VerbOne);
        System.out.println("I was " + AdjectiveThree + "!");

        scanner.close();
    }
}
