package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_2 {
    /**
     * 괄호문자제거
     */
    public static void main(String[] args) throws IOException {
        /**
         * 소괄호 사이에 들어간 문자를 모두 제거하고 남은 문자열만 출력
         *
         * 문자열을 반복하면서 하나씩 스택에 넣고,
         * 닫는 괄호를 만나면 여는 괄호를 만날때까지 pop한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = getSolution(input);
        System.out.println(answer);

    }

    private static String getSolution(String input) {
        Stack<Character> stack = new Stack<>();

        for (char target : input.toCharArray()) {
            stack.push(target);

            // 닫는 괄호를 만나면
            if (target == ')') {

                // 여는 괄호 '('를 만날 때까지 pop
                while (stack.peek() != '(') {
                    stack.pop();
                }

                // '('도 제거
                stack.pop();
            }

        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
