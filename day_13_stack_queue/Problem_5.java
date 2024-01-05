import java.util.Stack;

public class Problem_5 {

    // balanced brackets

    // using stack

    static boolean isBalancedString(String str) {
        Stack<Character> st = new Stack<>();
        for (char it : str.toCharArray()) {
            if (it == '(' || it == '{' || it == '[') {
                st.push(it);
            } else {
                if (st.isEmpty())
                    return false;
                char ch = st.pop();
                if ((it == ')' && ch == '(') || (it == ']' && ch == '[') || (it == '}' && ch == '{'))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";
        System.out.println(isBalancedString(str));
    }
}
