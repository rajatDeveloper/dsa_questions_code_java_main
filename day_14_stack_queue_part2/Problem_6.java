import java.util.Stack;

public class Problem_6 {
    class MinStack {
        Stack<Long> st;
        Long mini;

        public MinStack() {
            mini = Long.MAX_VALUE;
            st = new Stack<>();
        }

        public void push(int val) {
            Long mainVal = Long.valueOf(val);

            if (st.isEmpty()) {
                mini = mainVal;
                st.push(mainVal);
            } else {
                if (mainVal < mini) {
                    st.push(2 * mainVal - mini);
                    mini = mainVal;
                } else {
                    st.push(mainVal);
                }
            }
        }

        public void pop() {

            if (st.isEmpty()) {
                return;
            }

            Long val = st.pop();

            if (val < mini) {
                mini = 2 * mini - val;
            }
        }

        public int top() {
            Long val = st.peek();
            if (val < mini)
                return mini.intValue();
            return val.intValue();
        }

        public int getMin() {
            return mini.intValue();
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
