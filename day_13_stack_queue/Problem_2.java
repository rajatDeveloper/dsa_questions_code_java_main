public class Problem_2 {

    // queue using array and circular insertion and with double capcaity

    class QueueWithArray {
        private int[] data;
        private int front; // used for dequeue
        private int rear; // used for enqueue
        private int size;

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void capacity() {
            int[] temp = data;
            data = new int[2 * temp.length];
            int index = 0;
            for (int i = front; i < temp.length; i++) {
                data[index] = temp[i];
                index++;
            }
            for (int i = 0; i < front; i++) {
                data[index] = temp[i];
                index++;
            }

            front = 0;
            rear = temp.length - 1;
        }

        public void enqueue(int val) {
            if (size == data.length) {
                capacity();
            }
            if (size == 0) {
                front = 0;

            }
            rear = (rear + 1) % data.length;
            data[rear] = val;
            size++;
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = data[front];
            front = (front + 1) % data.length;
            size--;
            return val;
        }

        public int front() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return data[front];
        }

    }

    // queue using the LL

    class QueueUsingLL {

        private Node rear; // for enqueue
        private Node front; // for dequeue
        private int size;

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void enqueue(int val) {
            Node newNode = new Node(val);
            if (size == 0) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }
            size--;
            return val;
        }
    }

    public static void main(String[] args) {

    }
}
