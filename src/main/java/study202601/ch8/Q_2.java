package study202601.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2 {
    /**
     * 바둑이 승차(DFS)
     */
    static int max; // 트럭 최대 무게
    static int N; // 바둑이 수
    static int[] dogs; // 바둑이들 무게
    static int answer = 0; // 가장 무거운 무게


    public static void main(String[] args) throws IOException {
        // 트럭 최대 무게를 넘지 안흐면서 가능한 가장 큰 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        dogs = new int[N];

        for (int i = 0; i < N; i++) {
            dogs[i] = Integer.parseInt(br.readLine());
        }

        getSolutionDFS(0, 0);
        System.out.println(answer);

    }

    private static void getSolutionDFS(int index, int sum) {

        if (sum > max) return;
        answer = Math.max(answer, sum);

        if (index == N) return;

        // 현재 바둑이 태움
        getSolutionDFS(index + 1, sum + dogs[index]);

        // 현재 바둑이 안태움
        getSolutionDFS(index + 1, sum);
    }
}
