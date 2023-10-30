
class NodeBottom {
    int data;
    NodeBottom next;
    NodeBottom bottom;

    NodeBottom(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}

public class Problem_6 {

    // flater the list into one list as sorted ll single where next point to null
    // and all element connected using botttom pointer

    NodeBottom mergeTwoLists(NodeBottom a, NodeBottom b) {

        NodeBottom temp = new NodeBottom(0);
        NodeBottom res = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            } else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if (a != null)
            temp.bottom = a;
        else
            temp.bottom = b;
        return res.bottom;

    }

    NodeBottom flatten(NodeBottom root) {

        if (root == null || root.next == null)
            return root;

        // recur for list on right
        root.next = flatten(root.next);

        // now merge
        root = mergeTwoLists(root, root.next);

        // return the root
        // it will be in turn merged with its left
        return root;
    }

    public static void main(String[] args) {

    }
}
