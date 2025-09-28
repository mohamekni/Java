import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // if statements = performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;


        System.out.print("Enter Your Name : ");
        name = scanner.nextLine();
        System.out.print("Enter Your Age : ");
        age = scanner.nextInt();
        System.out.println("enter if you are student (true/false) : ");
        isStudent = scanner.nextBoolean();

        // Group 1
        if (name.isEmpty()){
            System.out.println("You didn't enter any name");
        }else {
            System.out.println("Welcome " +name);
        }

        // Group 2
        if(age < 0){
            System.out.println("You are haven't been born yet ");
        }else if (age == 0){
            System.out.println("You are a baby ");
        }else if (age >= 18){
            System.out.println("You are an adult");
        }else if (age >= 65){
            System.out.println("You are a senior");
        }else{
            System.out.println("You are a child");
        }

        // Group 3
        if(isStudent){
            System.out.println("You are student");
        }else{
            System.out.println("You are not student");
        }


        scanner.close();
    }
}
