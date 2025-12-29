package programmers.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class Q_12906 {
    public static void main(String[] args) {

        // arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
        // arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        solution(arr);

    }

    public static int[] solution(int[] arr) {

        // 1. arr의 모든 요소를 순회하면서
        // 2. 스택의 top에 있는 값(마지막 값)과 index 요소의 값을 비교한다.
        // 3. 두 값이 서로 다르면 배열의 값을 스택에 저장한다.

        // 스택의 0번째부터 top까지 출력한다.

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

/*

stack에 값을 넣는 조건중 isEmpty()는 배열의 첫번째 요소를 저장하기 위해서이다.


 */