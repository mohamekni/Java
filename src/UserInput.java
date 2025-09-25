import java.sql.SQLOutput;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the user: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age :");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Your gpa :");
        double gpa = scanner.nextDouble();

        System.out.print("are you student (Y/N)");
        char answer = scanner.next().charAt(0);
        boolean isStudent = false;
        if (answer == 'Y') {
            isStudent = true;
        }else if (answer == 'N') {
            isStudent = false;
        }


        System.out.println("Hello " + name + " You Are " + age + " years old, " + "Your Car is " + gpa);
        if(isStudent){
            System.out.println("And You are student");
        }else{
            System.out.println("And You are not student");
        }




        scanner.close();
         */

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width : ");
        width = sc.nextDouble();

        System.out.print("Enter the height : ");
        height = sc.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm²");


        sc.close();

    }
}
