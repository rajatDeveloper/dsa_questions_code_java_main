package day_7_linked_list_array;

import java.util.HashMap;

class NodeRandom {
    int val;
    NodeRandom next;
    NodeRandom random;

    NodeRandom(int value) {
        val = value;
        next = null;
        random = null;
    }
}

public class Problem_2 {

    // create new ll by copy original , LL node have random ,next val

    // bruth force
    static NodeRandom copyRandomList(NodeRandom head) {
        HashMap<NodeRandom, NodeRandom> hashMap = new HashMap<>();
        NodeRandom temp = head;
        // first iteration for inserting deep nodes of every node in the hashmap.
        while (temp != null) {
            NodeRandom newNode = new NodeRandom(temp.val);
            hashMap.put(temp, newNode);
            temp = temp.next;
        }
        NodeRandom t = head;
        // second iteration for linking next and random pointer as given question.
        while (t != null) {
            NodeRandom node = hashMap.get(t);
            node.next = (t.next != null) ? hashMap.get(t.next) : null;
            node.random = (t.random != null) ? hashMap.get(t.random) : null;
            t = t.next;
        }
        return hashMap.get(head);
    }

    static NodeRandom copyRandomListOptinal(NodeRandom head) {
        NodeRandom temp = head;
        // step 1
        while (temp != null) {
            NodeRandom newNode = new NodeRandom(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        // step 2
        NodeRandom itr = head;
        while (itr != null) {
            if (itr.random != null)
                itr.next.random = itr.random.next;
            itr = itr.next.next;
        }
        // step 3
        NodeRandom dummy = new NodeRandom(0);
        itr = head;
        temp = dummy;
        NodeRandom fast;
        while (itr != null) {
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }
        return dummy.next;
    }

}
