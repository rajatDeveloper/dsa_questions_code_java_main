public class Problem_2 {

    // get mid of LL

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // better soln
    static Node getMideBetter(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        int count = 0;

        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // get mid
        int mid = count / 2;

        for (int i = 0; i < mid; i++) {
            head = head.next;
        }

        return head;
    }

    // optimal way

    static Node getMiddleOfLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("The linked list is: ");

        printList(head);
        System.out.println("\nMid of pointer : " + " " + getMiddleOfLL(head).data);
    }
}
