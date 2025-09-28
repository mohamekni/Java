import java.util.Scanner;
public class ShoppingCartProgram {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency = '$';
        double total;

        System.out.print("Please enter the item you would like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price you would like to buy?: ");
        price = scanner.nextDouble();

        System.out.print("How many items you would like to buy?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("\nYou Have " + quantity + " " + item + "/s" + " of " + price +"$");
        System.out.println("Your total is $" + total +"$");


        scanner.close();
    }
}
