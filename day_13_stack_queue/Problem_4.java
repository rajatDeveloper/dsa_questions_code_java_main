import java.util.Stack;

public class Problem_4 {

    // Using two Stacks where push / Enqueue operation is O(N) but pop / Dequeue is
    // O(1)

    class MyQueue1 {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue1() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
            // Insert the desired element in the stack input
            System.out.println("The element pushed is " + x);
            input.push(x);
            // Pop out elements from the stack output and push them into the stack input
            while (output.empty() == false) {
                input.push(output.peek());
                output.pop();
            }

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            // shift input to output
            if (input.empty()) {
                System.out.println("Stack is empty");

            }
            int val = input.peek();
            input.pop();
            return val;

        }

        /** Get the front element. */
        public int peek() {
            // shift input to output
            if (input.empty()) {
                System.out.println("Stack is empty");

            }
            return input.peek();
        }

        int size() {
            return input.size();
        }
    }

    // Using two Stacks where push / Enqueue operation is O(1) and pop / Dequeue is
    // O(N)

    class MyQueue2 {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue2() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            System.out.println("The element pushed is " + x);
            input.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }

            int x = output.peek();
            output.pop();
            return x;
        }

        /** Get the front element. */
        public int peek() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }
            return output.peek();
        }

        int size() {
            return (output.size() + input.size());
        }

    }

    public static void main(String[] args) {

    }
}
