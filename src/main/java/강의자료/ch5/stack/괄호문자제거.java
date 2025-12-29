package 강의자료.ch5.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class 괄호문자제거 {

    public static void main(String[] args) throws IOException {
        /*

        입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는
        프로그램을 작성하세요.

        ▣ 입력설명
        첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

        ▣ 출력설명
        남은 문자만 출력한다.

        ▣ 입력예제 1
        (A(BC)D)EF(G(H)(IJ)K)LM(N)

        ▣ 출력예제 1
        EFLM

         */

        /* 구현방법

        1. 입력받은 문자열의 길이만큼 for loop를 돌면서 각 문자를 확인한다.
        2. 괄호가 아닌 문자 = push
        3. 여는 괄호 ( = push
        4. 닫는 괄호 ) = 여는 괄호를 만날 떄까지 pop
        5. 반복문이 끝나면 스택에 남아있는 문자들을 출력한다.

         */

        Deque<Character> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (char c : input.toCharArray()) {

            switch (c) {

                case ')' -> {
                    // 여는 괄호를 만날 때까지 pop
                    while ('(' != stack.pop()) {
                    }
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }
                }

                default -> stack.push(c);
            }
        }

        if (!stack.isEmpty()) {
            for (Iterator<Character> it = stack.descendingIterator(); it.hasNext(); ) {
                System.out.print(it.next());

            }
        }


    }
}
