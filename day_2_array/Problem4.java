public class Problem4 {

    // find duplicate of array of N+1 interges
    // input = [1,3,4,2,2,]
    // output = 2

    // optimal son

    // use hashing

    static int findDuplicate(int[] arr) {
        int n = arr.length;
        // n+1 size ka array

        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {

            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }

        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 2, 3 };
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }

}
