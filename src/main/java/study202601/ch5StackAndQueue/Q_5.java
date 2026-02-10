package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5 {
    /**
     * 쇠막대기
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = getSolution(input);
        System.out.println(answer);

    }

    private static int getSolution(String input) {
        /**
         * 포인트는 레이저를 구분하는 것
         * 여는 괄호'('를 만나면 스택에 저장한다. (=막대들)
         * 닫는 괄호')'를 만나면 우선 pop하고, 카운트 감소
         * 레이저인지, 막대의 끝인지 판단한다.
         * - 이전 값이 여는괄호면 레이저, 닫는괄호면 막대의 끝
         *
         * 레이저를 만나면 모든 막대가 잘리므로 스택에 쌓인 막대 수를 결과값에 더한다.
         *
         * 단순히 개수만 체크하면 되므로 int 변수를 활용해 스택의 깊이를 표현하는 방식이 메모리 면에서 유리
         */
        int total = 0;
        int cnt = 0; // 현재 겹쳐진 막대 개수

        for (int i = 0; i < input.length(); i++) {
            if ('(' == input.charAt(i)) {
                cnt++;
            } else {
                // 닫는 괄호를 만나면 카운트 감소
                cnt--;

                // 이전 괄호를 비교해서
                if (input.charAt(i - 1) == '(') {
                    // '('라면 레이저! -> 현재 쌓인 막대기 개수를 결과값에 합산
                    total += cnt;
                } else {
                    // 막대의 끝 지점이라면 -> 이 막대의 마지막 끝부분 1개 추가
                    total += 1;

                }

            }
        }

        return total;
    }

}
