package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q10828 {

    /*   스택구현하기

         push : 정수 x를 스택에 저장한다.
         pop : 가장 마지막의 정수를 제거한 뒤 그 수를 출력한다. 스택에 들어있는 정수가 없으면 -1을 출력한다.
         size: 스택에 들어있는 정수의 개수를 출력한다
         empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
         top: 스택의 가장 마지막에 있는 정수를 출력한다. 스택에 들어있는 정수가 없으면 -1을 출력한다.
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        // n개의 명령어를 입력받고 수행한다
        while (n > 0) {
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;

                case "pop":
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;

                case "top":
                    System.out.println(stack.isEmpty() ? -1 : stack.peekFirst());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
            }
            n--;
        }

    }
}
