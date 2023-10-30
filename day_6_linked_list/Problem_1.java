

import java.util.HashSet;

public class Problem_1 {

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // find intersection of two ll not same one by value but same refernce node ,
    // means common node of both ll

    static Node findIntersectionOFTWoLL(Node head1, Node head2) {
        HashSet<Node> st = new HashSet<Node>();

        while (head1 != null) {
            st.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (st.contains(head2)) {
                return head2;
            }
            head2 = head2.next;
        }

        return null;
    }

    static Node intersectionPresent(Node head1, Node head2) {
        Node d1 = head1;
        Node d2 = head2;

        while (d1 != d2) {
            d1 = d1 == null ? head2 : d1.next;
            d2 = d2 == null ? head1 : d2.next;
        }

        return d1;
    }

    public static void main(String[] args) {

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