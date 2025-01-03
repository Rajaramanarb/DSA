import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the 1st number: ");
//        int a = in.nextInt();
//        System.out.print("Enter the 2nd number: ");
//        int b = in.nextInt();
//
//        System.out.println(sum(a, b));
//    }
//
//    static int sum(int a, int b) {
//        return a + b;

        boolean b = ArmStrong(154);
        if (b)
            System.out.println("ArmStrong");
        else
            System.out.println("Not a ArmStrong");

    }

    static boolean ArmStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }

        return sum == original;
    }
}
