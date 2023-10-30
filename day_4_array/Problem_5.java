public class Problem_5 {

    // get total number of subarrays whose sum is k

    public static int getLongestSubarray(int[] a, int k) {
        int n = a.length; // size of the array.

        int maxarrays = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0;
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    maxarrays += 1;
            }
        }
        return maxarrays;
    }

    // optimal soln
    public static int getLongestSubarrayOp(int[] a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxArrays = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxArrays += 1;
            }

            // Move forward thw right pointer:
            right++;
            if (right < n)
                sum += a[right];
        }

        return maxArrays;
    }

    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 4 };
        int k = 6;
        int len = getLongestSubarrayOp(a, k);
        System.out.println("The length of the max subarray is: " + len);
    }
}
