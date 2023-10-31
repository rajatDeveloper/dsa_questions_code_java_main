package day_7_linked_list_array;

public class Problem_1 {

    // rotate the LL - in right by k

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // bruth force -> method

    static Node rotateRight(Node head, int k) {

        if (head == null || head.next == null)
            return head;

        for (int i = 0; i < k; i++) {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            Node end = temp.next;

            temp.next = null;
            end.next = head;
            head = end;
        }

        return head;

    }

    // optional soln

    static Node rotateRightOptimal(Node head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;
        // calculating length
        Node temp = head;
        int length = 1;

        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }

        // link last node to first node
        temp.next = head;

        k = k % length; // when k is more than length of list

        int end = length - k; // to get end of the list

        while (end-- != 0)
            temp = temp.next;

        // breaking last node link and pointing to NULL
        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        printList(rotateRightOptimal(head1, 3));

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
