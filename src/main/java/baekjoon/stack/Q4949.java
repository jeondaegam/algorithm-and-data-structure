package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q4949 {
    public static void main(String[] args) throws IOException {

        // 문자열에 포함되는 소괄호와 대괄호의 균형이 맞는지 확인하자

        // 1. 문장을 입력받는다.
        // 2. 입력 종료 조건은 온점 "." 하나가 들어온다.

        // 스택을 만든다.
        // 여는 괄호에 정수값을 준다. '(' == 1, '[' == 2
        // 닫는 괄호를 만나면 stack의 첫 번째 값을 확인한다.
        // 첫 번째 값과 닫는 괄호가 한쌍이면 pop 한다.
        // 한쌍이 아니면 isBalanced를 false로 저장한다.
        // 최종적으로 스택의 모든 괄호가 다 사용되어 균형이 맞고, 스택이 비어있으면 "yes"를 출력한다


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!".".equals(line = br.readLine())) {
            // 문장을 한줄 입력받을 때마다 초기화
            Deque<Integer> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            for (char c : line.toCharArray()) {
                switch (c) {
                    case '(':
                        stack.push(1);
                        break;

                    case '[':
                        stack.push(2);
                        break;

                    case ')':

                        // 스택이 비어있거나 1이 아니면 isBalance = false;
                        // 스택의 첫번째 값이 1이면 pop

                        if (stack.isEmpty() || stack.peek() != 1) {
                            isBalanced = false;
                        } else {
                            stack.pop();
                        }
                        break;
                    case ']':
                        // 스택이 비어있거나 peek이 2가 아니면 isBalanced = false
                        if (stack.isEmpty() || stack.peek() != 2) {
                            isBalanced = false;
                        } else {
                            stack.pop();
                        }
                        break;
                }
                if (!isBalanced) {
                    break;
                }
            }

            System.out.println((isBalanced && stack.isEmpty()) ? "yes" : "no");
        }

        br.close();

    }
}
