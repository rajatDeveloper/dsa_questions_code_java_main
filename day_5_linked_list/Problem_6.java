public class Problem_6 {

    // delete the node O(1)

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static void deleteNode(Node node) {

        if (node == null)
            return;

        node.data = node.next.data;
        node.next = node.next.next;
        return;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        deleteNode(head1.next);
        printList(head1);

    }
}
