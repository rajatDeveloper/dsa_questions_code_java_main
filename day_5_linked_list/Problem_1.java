import java.util.LinkedList;

public class Problem_1 {

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node reverNode(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    static Node recrsiveReverseNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = recrsiveReverseNode(head.next);
        Node headNext = head.next;

        headNext.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("The linked list is: ");
        printList(head);
        Node newHead = recrsiveReverseNode(head);
        System.out.println("\nThe reverse linked list is: ");
        printList(newHead);

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
