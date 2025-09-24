public class Variables {
    public static void main(String[] args) {
        // Variables = a reusable container for a value
        //             a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive  vs  Reference
        // ---------      ---------
        // int            string
        // double         array
        // char           object
        // boolean

        // 2 steps to creating a variable
        // 1 - Declaration
        // 2 - assignment

        int age = 22;
        int year = 2025;
        int quantity = 1;
        System.out.println("The Year is " + year + " and the quantity is " + quantity);

        double price = 22.5;
        double gpa = 2.5;
        double temperature = -12.5;
        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = false;
        System.out.println(isStudent);

        if(isOnline){
            System.out.println("The Student is Present");
        }else{
            System.out.println("The Student is not Present");
        }

        String name = "MohaSoGoodNoLove";
        String food = "Humberger";
        String email = "fake@gmail.com";
        String car = "Mustang";
        System.out.println("Hello " + name + "Your Favorite Food is " + food);
        System.out.println("Your Email is " + email);
    }
}
