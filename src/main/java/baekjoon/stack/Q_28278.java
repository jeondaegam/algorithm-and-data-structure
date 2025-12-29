package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_28278 {
    public static void main(String[] args) throws IOException {

        // 스택 구현

        // 정수를 저장하는 스택을 구현한다.
        // 명령은 정수로 입력받는다.

        // 1. 명령 개수를 입력받는다.
        // 2. 명령 개수만큼 반복하면서 명령을 입력받는다.

        // 명령어는 string으로 받고, 정수는 int로 입력받자

        // 입력 받을 버퍼
        // 정수형 스택
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        while (count++ < n) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "1":
                    // 정수를 스택에 저장한다.
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "2":
                    // 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다.
                    // 없다면 -1을 출력한다.
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "3":
                    // 스택에 들어잇는 정수의 개수를 출력한다.
                    System.out.println(stack.size());
                    break;
                case "4":
                    // 스택이 비어있으면 1, 아니면 0을 출력한다.
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "5":
                    // 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없으면 -1을 출력한다.
                    System.out.println(stack.isEmpty() ? -1 : stack.peekFirst());
                    break;
            }

        }

    }
}
