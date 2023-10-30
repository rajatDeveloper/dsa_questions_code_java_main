import java.util.ArrayList;

public class Problem5 {

    // sort array 0 , 1 , 2

    // better soln
    static void sortArray(int[] arr) {
        int one = 0;
        int two = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }

        for (int i = zero; i < zero + one; i++) {
            arr[i] = 1;
        }

        for (int i = zero + one; i < arr.length; i++) {
            arr[i] = 2;
        }

    }

    static void optimalSoln(ArrayList<Integer> arr, int n) {

        int low = 0, mid = 0, high = 0;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
                mid++;

            }
        }
    }

    public static void main(String[] args) {

    }
}
