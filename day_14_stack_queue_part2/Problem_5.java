import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_5 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n - k + 1]; // ans will have k less
        int ri = 0; // index for r array

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // remove the out of bond elments
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }

            // remove smaller elemets in range as they are useless

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = nums[q.peek()];
            }

        }
        return r;
    }
}
