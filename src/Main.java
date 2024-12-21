import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Number: " + a);
    }
}