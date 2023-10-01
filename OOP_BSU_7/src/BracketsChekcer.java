import java.util.Stack;

public class BracketsChekcer {
    public static boolean areBracketsBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch: str.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if(!((top == '(' && ch == ')') ||
                        (top == '[' && ch == ']') ||
                            (top == '{' && ch == '}'))){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
