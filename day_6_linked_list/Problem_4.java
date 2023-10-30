public class Problem_4 {
    // is ll is palindrome or not

    static Node reverse(Node head) {
        Node curr = head, prev = null, fwd = null;

        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
    }

    static boolean isPalindromeLL(Node head) {
        if (head == null || head.next == null)
            return true;

        // we need to find the mid or center of LL
        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHead = slow.next;

        slow.next = null;

        secondHead = reverse(secondHead);

        Node firsthalfLL = secondHead;
        Node secondhalfLL = head;

        while (firsthalfLL != null) {
            if (firsthalfLL.data != secondhalfLL.data)
                return false;

            firsthalfLL = firsthalfLL.next;
            secondhalfLL = secondhalfLL.next;
        }

        // rejoin them to make them normal as originals

        firsthalfLL = head;
        secondhalfLL = reverse(secondHead);

        while (firsthalfLL.next != null) {
            firsthalfLL = firsthalfLL.next;
        }

        firsthalfLL.next = secondhalfLL;

        return true;
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(2);

        System.out.println(isPalindromeLL(head1));

    }
}
