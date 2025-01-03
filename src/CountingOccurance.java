public class CountingOccurance {
    public static void main(String[] args) {
        int n = 457655;

        int count = 0;
        while(n > 0){
            if(n%10 == 5)
                count++;
            n = n/10;
        }

        System.out.println(count);
    }
}
