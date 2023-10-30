import java.util.HashSet;

public class Problem_5 {
    // get or find the starting point of cycle in ll

    // better sol use hasing

    static Node detectCycle(
            Node head) {

        if (head == null || head.next == null)
            return null;

        HashSet<Node> st = new HashSet<>();

        while (head != null) {
            if (st.contains(head)) {
                return head;
            }
            st.add(head);
            head = head.next;
        }

        return null;
    }

    // using the slow , fast and enrty logic

    static Node detectCycle2(Node head) {
        if (head == null || head.next == null)
            return null;

        Node slow = head, fast = head, entry = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }

    static void createCycle(Node head, int pos) {
        Node ptr = head;
        Node temp = head;
        int cnt = 0;
        while (temp.next != null) {
            if (cnt != pos) {
                ++cnt;
                ptr = ptr.next;
            }
            temp = temp.next;
        }
        temp.next = ptr;
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        // pos is index
        createCycle(head1, 0);

        System.out.println(detectCycle(head1).data);

    }
}
