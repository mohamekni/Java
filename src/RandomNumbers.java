import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double doub;
        boolean bool;

        number = random.nextInt(1 , 100);
        doub = random.nextDouble(1,100);
        bool = random.nextBoolean();

        System.out.println(number);
        System.out.println(doub);
        System.out.println(bool);

    }
}
