package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Q_17413 {

    public static void main(String[] args) throws IOException {

        // 입력된 단어를 뒤집어서 출력한다.
        // 단어의 구분은 공백이다.
        // 이 때 html 태그 형식은 뒤집지 않는다.

        // 1. 문자열을 입력받는다.
        // 2. 문자열을 한 문자씩 확인한다.
        // 3. 일반 문자열은 스택에 넣는다.
        // 4. 공백을 만나면 스택에 있는 모든 문자열을 pop해서 출력하고, 공백을 출력한다.
        // 5. '<' 문자를 만나면 is괄호를 true로 변경하고 스택에 저장한다.
        // 6. is괄호가 true인 상태에서는 공백을 만나면 저장한다.
        // 7. '>' 문자를 만나면 값을 저장하고, is괄호를 false로 변경 후 스택에 있는 모든 값을 FIFO로 출력한다.


        // 공백을 push 하는 케이스  -> 앞에 '<'가 저장되었을 때 (isInTag == true)
        // 공백을 pop 하는 케이스 -> 앞에 '<'가 저장되지 않았을 때 (isInTag == false)

        // '<' 여는 꺽쇠가 저장된 경우를 체크해야함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        StringBuilder answer = getStringBuilder(inputLine);

        System.out.println(answer);
        br.close();
    }

    private static StringBuilder getStringBuilder(String inputLine) {
        StringBuilder answer = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isInTag = false;

        for (char c : inputLine.toCharArray()) {
            switch (c) {

                case '<' -> {
                    // 시작 태그를 만나면 기존 단어 모두 출력
                    while (!stack.isEmpty()) {
                        answer.append(stack.pop());
                    }
                    isInTag = true;
                    answer.append('<');
                }

                case '>' -> {
                    // 닫는 태그 만나면 닫아주기
                    isInTag = false;
                    answer.append('>');
                }


                // 공백이
                case ' ' -> {
                    if (isInTag) {
                        // 태그 안의 공백일 경우
                        answer.append(' ');
                    } else {
                        // 단어 사이의 공백일 경우 -> 스택에 쌓인 단어 모두 뒤집어서 출력
                        while (!stack.isEmpty()) {
                            answer.append(stack.pop());
                        }
                        answer.append(' ');
                    }
                }

                default -> {
                    if (isInTag) {
                        // 태그 안의 문자 - 그대로 출력
                        answer.append(c);
                    } else {
                        // 태그 밖의 문자 - 스택에 저장(나중에 뒤집기)
                        stack.push(c);
                    }
                }
            }
        }

        // 반복 종료 후 스택에 남은 마지막 단어 뒤집어서 출력
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        return answer;
    }

}
