import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("For Loop");
        for (int i = 1; i <= n; i++)
            System.out.println(i);

        System.out.println("While Loop");
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }

        System.out.println("Do-While Loop");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
