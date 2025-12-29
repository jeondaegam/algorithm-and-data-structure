package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Q_9012 {

    public static void main(String[] args) throws IOException {

        // 1. n 만큼 명령어를 입력받는다.
        // 2. 명령어에 push가 들어올경우 스택에 값을 저정한다.
        // 3. 명령어에 pop이 들어올경우 스택에서 가장 마지막 값을 제거한다.

        // 명령어 정의
        /*
         push : 정수 x를 스택에 저장한다.
         pop : 가장 마지막의 정수를 제거한 뒤 그 수를 출력한다. 스택에 들어있는 정수가 없으면 -1을 출력한다.
         size: 스택에 들어있는 정수의 개수를 출력한다
         empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
         top: 스택의 가장 마지막에 있는 정수를 출력한다. 스택에 들어있는 정수가 없으면 -1을 출력한다.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력받을 명령 개수
        List<Integer> stack = new ArrayList<>();

        String command = "";

        while (n > 0) {
            command = br.readLine();
            if (command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                push(stack, num);
            } else if (command.equals("pop")) {
                stack = pop(stack);
            } else if (command.equals("top")) {
                getTop(stack);
            } else if (command.equals("size")) {
                getSize(stack);
            } else if (command.equals("empty")) {
                isEmpty(stack);
            }

            n--;
        }


    }

    /**
     * 정수 x를 스택에 저장한다.
     *
     * @param stack
     * @param num
     */
    private static List<Integer> push(List<Integer> stack, int num) {
        stack.add(num);
        return stack;
    }

    /**
     * 가장 마지막의 정수를 제거한 뒤 그 수를 출력한다.
     * 스택에 들어있는 정수가 없으면 -1을 출력한다.
     *
     * @param stack
     */
    private static List<Integer> pop(List<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
        return stack;
    }

    /**
     * 스택에 들어있는 정수의 개수를 출력한다
     *
     * @param stack
     */
    private static void getSize(List<Integer> stack) {
        System.out.println(stack.size());
    }

    /**
     * 스택이 비어있으면 1, 아니면 0을 출력한다.
     *
     * @param stack
     */
    private static void isEmpty(List<Integer> stack) {
        System.out.println(stack.isEmpty() ? 1 : 0);
    }

    /**
     * 스택의 가장 마지막에 있는 정수를 출력한다.
     * 스택에 들어있는 정수가 없으면 -1을 출력한다.
     *
     * @param stack
     */
    private static void getTop(List<Integer> stack) {
        System.out.println(stack.isEmpty() ?
                -1 : stack.get(stack.size() - 1));
    }

}
