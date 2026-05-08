import java.util.Stack;

public class balancedBrackets {
    public boolean isBalanced(String x) {
        Stack<Character> st = new Stack<>();
        for (char i : x.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                st.push(i);
            } else {
                if (st.isEmpty()) return false;
                char p = st.pop();
                if ((i == ')' && p != '(') || 
                    (i == '}' && p != '{') || 
                    (i == ']' && p != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
