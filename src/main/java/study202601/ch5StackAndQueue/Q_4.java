package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 후위식 연산
 */
public class Q_4 {
    public static void main(String[] args) throws IOException {
        /**
         * 숫자는 무조건 스택에 쌓고
         * 연산자를 만나면, 스택에서 숫자 2개를 꺼내서 계산한다.
         * <순서 절대 중요> 먼저 나온 숫자가 오른쪽, 그 다음이 왼쪽
         * 왼쪽에서 오른쪽으로 읽으며 계산하기 떄문
         * 3 - 5 ≠ 5 - 3
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = getSolution(input);
        System.out.println(answer);

    }

    private static int getSolution(String input) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {

            // 1. 숫자를 만나면 스택에 저장
            // 2. 연산자면, 스택에서 숫자 두개를 꺼내 기호에 따라 연산한다.
            // 3. 연산 결과를 스택에 다시 저장

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int right = stack.pop();
                int left = stack.pop();
                int result = 0;

                switch (c) {
                    case '+': result = left + right; break;
                    case '-': result = left - right; break;
                    case '*': result = left * right; break;
                    case '/': result = left / right; break;
                }

                stack.push(result);
            }
        }
        return stack.pop();
    }
}
