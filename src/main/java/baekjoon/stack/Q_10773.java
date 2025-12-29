package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_10773 {
    public static void main(String[] args) throws IOException {
        // K를 입력받는다 (정수)
        // K개의 정수를 한줄씩 입력받는다.
        // 정수가 0일 경우에는 가장 최근에 쓴 수를 지운다.
        // 정수가 0일 경우 지울 수 있는 수가 있음을 보장할 수 있다.

        // 적어낸 수의 합을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        // List의 길이가 n이 될 때까지 입력받는다.
        // 입력받는 수가 0이면 List의 마지막 요소를 제거한다.
        // 입력받는 수가 0이 아니면 List에 추가한다.

        while (n > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(num);
            }
            n--;
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
