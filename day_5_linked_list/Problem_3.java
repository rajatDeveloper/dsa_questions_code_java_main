public class Problem_3 {

    // merge two sorted LL

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node mergeTwoHead(Node head1, Node head2) {

        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        Node t1 = head1, t2 = head2;

        Node head = null, tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {

            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }

        }

        if (t1 != null) {
            tail.next = t1;
        }
        if (t2 != null) {
            tail.next = t2;
        }

        return head;

    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(-1);
        head2.next = new Node(-5);
        head2.next.next = new Node(9);

        Node newHead = mergeTwoHead(head1, head2);
        printList(newHead);

    }
}
