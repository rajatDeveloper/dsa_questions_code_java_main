import java.util.Arrays;
import java.util.HashMap;

public class Problrm_1 {

    // 2 sum
    // a[] + a[] = target then return the [indexa , index b]

    // better soln

    static int[] twoSumBetterSoln(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[2];

        // iterarte through the arr
        for (int i = 0; i < arr.length; i++) {
            int mainNumber = arr[i];
            int leftedPart = target - mainNumber;

            if (map.containsKey(leftedPart)) {
                ans[0] = map.get(leftedPart);
                ans[1] = i;
                return ans;
            }

            map.put(mainNumber, i);
        }

        return ans;
    }

    public static String twoSum(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return "NO";
    }

    public static void main(String[] args) {

        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSumBetterSoln(arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
    }
}
