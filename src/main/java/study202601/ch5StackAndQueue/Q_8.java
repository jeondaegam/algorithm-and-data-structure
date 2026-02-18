package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_8 {
    /**
     * 응급실
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] input = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int answer = getSolution(N, M, input);
        System.out.println(answer);

    }

    private static int getSolution(int num, int targetIndex, int[] waitingList) {

        /**
         * 문제 풀이 순서:
         * 1. 대기목록에 N명의 환자가 있다.
         * 2. 대기목록의 M번째 환자가 몇 번째로 진료를 받는지 구하는 문제.
         * 3. 진료 순서는 환자의 *위험도*에 따라 결정된다. (위험도가 높으면 우선 진료)
         *
         * 4. 각 환자 정보를 큐에 저장한다. (위험도, 대기열 순번)
         * 5. 큐에서 하나씩 꺼내면서 **가장 위험한 환자**를 찾는다.
         * 6. 꺼낸 환자보다 위험도가 높은 환자가 있으면, 이 환자는 대기열 뒤로 밀려난다.
         * 7. 가장 위험한 환자가 진료를 받으면 카운트를 증가시킨다.
         * 8. 이때, **M번째 환자**가 진료를 받으면 종료한다.
         *
         * - 각 환자는 위험도와 대기열 순번을 기억해야 한다.
         * - 도착 순서대로 처리하되, 위험도가 낮은 환자는 뒤로 밀린다.
         */

        // 큐 선언: 환자의 위험도와 대기열 순번을 저장
        Deque<Patient> queue = new ArrayDeque<>();

        // 대기목록을 큐에 저장
        for (int i = 0; i < num; i++) {
            queue.offer(new Patient(waitingList[i], i));
        }

        int count = 0; // 진료 받은 환자 수

        // 큐에 환자가 남아있는동안 반복
        while (!queue.isEmpty()) {
            // 첫 번째 환자를 꺼낸다.
            Patient current = queue.poll();
            boolean currentIsMaxRisk = true;

            // 큐에 남은 다른 환자들과 비교
            for (Patient other : queue) {
                // 현재 환자보다 위험한 환자가 있으면
                if (other.risk > current.risk) {
                    currentIsMaxRisk = false; // 현재 환자는 뒤로 밀림
                    break;
                }
                // 리스크가 더 큰 환자를 만나면
            }

            // 현재 환자가 가장 위험하면
            if (currentIsMaxRisk) {
                count++; // 진료 받음
                if (current.index == targetIndex) { // 진료받은 환자가 몇번째 환자인지 체크, 찾던 순번이면
                    return count; // target 환자가 진료받은 순서 반환
                }
            } else {
                // 위험도가 낮으면 뒤로 보냄
                queue.offer(current);
            }

        }
        return -1; // target환자가 없을 경우
    }


}

class Patient {
    int risk;
    int index;

    public Patient(int risk, int index) {
        this.risk = risk;
        this.index = index;
    }
}
