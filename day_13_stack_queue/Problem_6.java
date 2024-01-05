import java.util.*;

public class Problem_6 {

    // Input: N = 11, A[] = {3,10,4,2,1,2,6,1,7,2,9}

    // Output: 10,-1,6,6,2,6,7,7,9,9,10
    static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) {
                    ans[i] = st.peek();
                } else
                    ans[i] = -1;
            }
            st.push(arr[i % n]);
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
