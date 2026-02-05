package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Q_1 {
    /**
     * 올바른 괄호
     */
    public static void main(String[] args) throws IOException {
        /**
         * 1. 괄호묶음을 입력받는다.
         * 2. 괄호들을 반복하면서 "(" 일 땐 +1, ")" 일 땐 -1을 스택에 넣는다.
         * 3. 반복도중 스택의 top이 -1이 되는 순간 "NO"
         * 4. 모든 괄호를 체크 한 뒤 결과값이 0이라면 "YES"
         *
         * 꼭 스택이 아니고, int형 변수 하나로 해도 될 것 같아.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = getSolution(input);
        System.out.println(answer);

    }

    private static String getSolution(String input) {
        int top = 0; // 현재 열린 '(' 여는괄호 개수

        for (char target : input.toCharArray()) {
            if (target == '(') {
                top++; // 여는 괄호면 개수 증가
            } else {
                top--; // 닫는 괄호면 하나 닫기

                // 닫을 괄호가 닫으려는 경우
                if (top == -1) {
                    return "NO";
                }

            }
        }

        // 모든 괄호를 처리한 뒤 열린 괄호가 없으면 올바른 괄호묶음!
        return top == 0 ? "YES" : "NO";
    }
}
