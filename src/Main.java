import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,6};
//        int target = 5;
//        System.out.println(BinarySearch(arr, target));

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;

        System.out.println(Arrays.toString(LinearSearch(arr, target)));

//        for (int[] i : arr) {
//            System.out.println(Arrays.toString(i));
//        }

//        String name = "Rajaramana";
//        for(int i = 0; i < name.length(); i++)
//            System.out.println(name.charAt(i));
    }

    static int[] LinearSearch(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

//    static int BinarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == target)
//                return arr[mid];
//            else if (target < arr[mid])
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//        return arr[end];
//    }
}
