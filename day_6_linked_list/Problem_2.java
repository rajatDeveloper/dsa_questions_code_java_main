

import java.util.HashSet;

public class Problem_2 {

    // detetct the cycle in ll

    // better sol with hash set

    static boolean detectTheCycel(Node head) {

        HashSet<Node> set = new HashSet<Node>();

        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }

        return false;
    }

    // optional soln

    static boolean detectTheCy(Node head) {
        Node slow = head;
        Node fast = head;

        while (head.next != null && head.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
