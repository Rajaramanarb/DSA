import java.util.Arrays;

public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start < arr.length && end >= 0){
            if(arr[start][end] == target){
                return new int[] {start, end};
            } else if (arr[start][end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }
}
