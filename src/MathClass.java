import java.sql.SQLOutput;
import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {
        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        double result;
        result = Math.pow(2,6);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(4.44);
        result = Math.ceil(4.44);
        result = Math.floor(4.6);
        result = Math.max(1,20);
        result = Math.min(1,20);

        System.out.println(result);

        // Hypotenuse => c = Math.sqrt(A² * B²)
        Scanner scanner = new Scanner(System.in);
        double A;
        double B;
        double C;

        System.out.print("Enter the Side of A: ");
        A = scanner.nextDouble();

        System.out.print("Enter the Side of B: ");
        B = scanner.nextDouble();

        C = Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
        System.out.println("The C value is: " + C);

        // circumference = 2 * math.pi * radius
        // area = math.pi * math.pow(radius,2)
        // volume = (4.0/3.0) * math.pi * math.pow(radius, 3)
        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The area is: %.1f" , area);
        System.out.printf("The volume is: %.1f" , volume);
        System.out.printf("The circumference is: %.1fcm" ,circumference);

        scanner.close();
    }

}
