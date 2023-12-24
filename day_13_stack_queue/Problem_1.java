public class Problem_1 {
    // stack using arrays

    class StackWithArray {

        private int[] data;
        private int topIndex;

        public StackWithArray(int capacity) {
            data = new int[capacity];
            topIndex = -1;
        }

        public StackWithArray() {
            data = new int[10];
            topIndex = -1;
        }

        public int size() {
            return topIndex + 1;
        }

        public boolean isEmpty() {
            return size() == -1;
        }

        public void push(int val) {
            if (size() == data.length) {
                doubleStorage();
            }
            topIndex++;
            data[topIndex] = val;
        }

        private void doubleStorage() {
            int[] temp = data;
            data = new int[2 * temp.length];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int val = data[topIndex];
            topIndex--;
            return val;
        }

    }

    // stack using LL

    class StackUsingLL {

        private Node head;
        private int size;

        public StackUsingLL() {
            head = null;
            size = 0;

        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            size++;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int top() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

    }

}
