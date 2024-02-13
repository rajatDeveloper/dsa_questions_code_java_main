import java.util.Stack;

public class Problem_4 {
    // largets area of rectangle

    public int maxAreaOfRect(int heights[]) {
        int maxA = 0;

        int n = heights.length;
        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];

        // filling leftSmall data
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty())
                leftSmall[i] = 0;
            else
                leftSmall[i] = st.peek() + 1;

            st.push(i);
        }

        // blank the stack
        while (!st.isEmpty())
            st.pop();

        // filling rightSmall data

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty())
                rightSmall[i] = n - 1;
            else
                rightSmall[i] = st.peek() - 1;

            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }

        return maxA;
    }
}
