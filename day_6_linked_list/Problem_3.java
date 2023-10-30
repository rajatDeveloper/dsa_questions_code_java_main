public class Problem_3 {

    // k reverse direction - ll
    // input - 1-2-3-4-5-6-7-8 , k = 3
    // output - 3-2-1-6-5-4-8-7
    

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node kReverse(Node head, int k) {
        if (k == 0 || k == 1) {
            return head;
        }

        Node current = head, fwd = null, prev = null;
        int count = 0;

        while (count < k && current != null) {

            fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
            count++;

        }

        if (fwd != null) {
            head.next = kReverse(fwd, k);
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        System.out.println("i am here ");

        printList(kReverse(head1, 3));

    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
