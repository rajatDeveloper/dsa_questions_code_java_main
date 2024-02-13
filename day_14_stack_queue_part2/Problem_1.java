

import java.util.*;

public class Problem_1 {
    // Problem statement
    // You are given an integer array 'a' of size 'n'.

    // For each element in the array, check whether the immediate right element of
    // the array is smaller or not.

    // If the next element is smaller, update the current index to that element. If
    // not, then -1. The last element does not have any elements on its right.
    // Example :
    // Input: 'a' = [4, 7, 8, 2, 3, 1]

    // Output: Modified array 'a' = [-1, -1, 2, -1, 1, -1]

    // Explanation: In the array 'a':
    // 4 has 7 on its right. Since 7 is not smaller, we update 4 to -1.

    // 7 has 8 on its right. Since 8 is not smaller, we update 7 to -1.

    // 8 has 2 on its right. Since 2 is smaller than 8, we update 8 to 2.

    // 2 has 3 on its right. Since 3 is not smaller, we update 2 to -1.

    // 3 has 1 on its right. Since 1 is smaller than 3, we update 3 to 1.

    // 1 does not have any element on right. So we update 1 to -1.

    // Using stack

    static void immediateSmaller(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (st.peek() > arr[i]) {
                arr[i - 1] = arr[i];
            } else {
                arr[i - 1] = -1;
            }
            st.add(arr[i]);

        }
        arr[n - 1] = -1;
    }



    public static void immediateSmallerUsingNormal(int []a)
    {
        int n = a.length;
        // Run a loop from index 0
        for (int i = 0; i < n - 1; i++)
        {
            // Check for the next element
            if (a[i + 1] < a[i]) {
                a[i] = a[i + 1];
            } else {
                a[i] = -1;
            }
        }

        // Finally for the last element put it as -1
        a[n - 1] = -1;
    }

    public static void main(String[] args) {

    }
}
