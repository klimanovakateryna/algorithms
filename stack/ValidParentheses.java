import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String testString1 = "()[]{}";
        String testString2 = "(]";
        String testString3 = "()";
        System.out.println(isValidParentheses(testString1));
        System.out.println(isValidParentheses(testString2));
        System.out.println(isValidParentheses(testString3));
    }

    public static boolean isValidParentheses(String string) {
        Stack<Character> bracketStack = new Stack<>();
        int size = string.length();
        for (int i = 0; i < size; i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                bracketStack.push(currentChar);
            } else {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                char openingBracket = bracketStack.pop();

                if ((currentChar == ')' && openingBracket == '(') ||
                        (currentChar == ']' && openingBracket == '[') ||
                        (currentChar == '}' && openingBracket == '{')) {
                            return true;
                } else {
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }
}

// declare a stack
// check if empty
// if an opening bracket, push it into the stack
// keep pushing the opening brackets until encountering the closing bracket
// when you encounter the closing bracket, pop the item from the top of stack
// check if the brackets match
// if yes, return true
// if no, return false

// Given a string s containing just the characters '(', ')', '{', '}', '[' and
// ']', determine if the input string is valid.
