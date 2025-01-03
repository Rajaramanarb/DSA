import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the 1st number: ");
                int a = in.nextInt();
                System.out.print("Enter the 2nd number: ");
                int b = in.nextInt();

                if (op == '+')
                    ans = a + b;
                if (op == '-')
                    ans = a - b;
                if (op == '*')
                    ans = a * b;
                if (op == '/') {
                    if (b != 0)
                        ans = a / b;
                }
                if (op == '%') {
                    if (b != 0)
                        ans = a % b;
                }

                System.out.println("Result: " + ans);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator!");
            }
        }
    }
}
