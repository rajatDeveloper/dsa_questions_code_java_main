import java.util.LinkedList;
import java.util.Queue;

public class Problem_3 {

    // stack using single queue

    public class StackUsingQueue {
        Queue<Integer> q = new LinkedList<>();

        public int size() {
            return q.size();
        }

        public void push(int val) {
            q.add(val);

            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());
            }
        }

        public int pop() {
            if (q.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return q.remove();
        }

        public int top() {
            if (q.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return q.peek();
        }

    }

    public static void main(String[] args) {

    }
}
