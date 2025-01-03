public class Typecasting {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);
        // If the d is declared as byte it will give an error because 40 * 50 is 2000 but the range of byte is -128 to 127

        float num = 57.13f;
        int num1 = (int) (num);
        System.out.println(num1);
    }
}
