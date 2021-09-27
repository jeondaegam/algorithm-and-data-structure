package leetCode.easy;

import java.util.Stack;

public class Q20ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); //true
        System.out.println("2=> " + isValid("{[]}")); //true
        System.out.println(isValid("(((]))")); //false
    }

    private static boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        char[] arr = s.toCharArray();
        if (arr.length == 0) return false;

        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.size() == 0) return false;
            if (c == ')') {
                if (stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.pop() != '{') {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
