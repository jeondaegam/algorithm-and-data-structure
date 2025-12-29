package 이코테2021.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    /*
        <문제> 1이 될 때까지
        어떠한 수 N이 1이 될 때까지 다음 두 과정 중 하나를 반복적으로 선택하여 수행하려 한다.
        2번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.

        1. N에서 1을 뺀다.
        2. N을 K로 나눈다.

        예를 들어 N이 17, K가 4라고 가정하자.
        이때 1번을 수행하면 N은 16이 된다.
        그 다음 2번의 과정을 2번 수행하면 N은 1이 된다.
        이 경우 전체 과정을 실행한 횟수는 3이 된다.
        이는 N을 1로 만드는 최소 횟수이다.

        <문제 해결 아이디어>
        주어진 N에 대해 나누기를 최대한 많이 수행하면 된다.
        N의 값을 줄일 때 2 이상의 수로 나누는 작업이 1을 뺴는 작업보다 수를 훨씬 많이 줄일 수 있다.

        입력 예시
        17 4
        출력 예시
        3


    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split("\\s");
        int n = Integer.valueOf(nums[0]);
        int k = Integer.valueOf(nums[1]);
        int count = 0;
        // 1. N - 1
        // 2. N / K

        while (n != 1 && n > 0) {
            // 나눌 수 있다면 나누는 작업을 먼저 수행한다.
            if (n % k == 0) {
                n /= k;
            } else {
                // 나눌 수 없다면 -1을 한다.
                n -= 1;
            }
            count++;

        }

        System.out.println("count : " + count);

    }
}
