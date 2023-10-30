public class Problem_4 {

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // return the lsit , remove n th nide forom last

    // better soln
    static Node removeNthFromEnd(Node head, int n) {
        Node start = new Node(1);
        start.next = head;
        Node fast = start;
        Node slow = start;

        for (int i = 1; i <= n; ++i)
            fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // printList(head1);

        printList(removeNthFromEnd(head1, 3));
    }

}
