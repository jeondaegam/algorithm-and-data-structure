package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10 {
    /**
     * 봉우리 구하기
     */
    public static void main(String[] args) throws IOException {

        /*
           1. 자연수 N을 입력받는다.
           2. N*N 격자판의 높이 정보를 입력받는다.
           3. 격자판 가장자리를 0으로 감싸 map 배열 생성.
           4. 내부(1~N) 격자를 반복하며 각 위치가 상하좌우보다 큰지 확인.
           5. 봉우리이면 카운트를 증가시키고 최종 봉우리 개수 출력.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] input = new String[N][N];

        for (int i = 0; i < N; i++) {
            input[i] = br.readLine().split(" ");
        }

        int answer = getSolution(N, input);
        System.out.println(answer);

    }

    private static int getSolution(int N, String[][] input) {
        // 1. 상하좌우 이동 배열
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        int[][] map = new int[N + 2][N + 2]; // '0'을 넣을 양쪽 경계 추가

        for (int i = 0; i < N; i++) {
            int[] arr = Arrays.stream(input[i])
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < N; j++) {
                map[i + 1][j + 1] = arr[j]; // map[1~N][1~N]에 값 넣기
            }

        }

        int count = 0;

        // 2. 배열의 내부만 탐색 (1~N)
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int current = map[i][j];
                boolean isTop = true; // 일단 봉우리라고 가정함

                // 3. 상하좌우 확인
                for (int k = 0; k < 4; k++) {

                    // 현재 인덱스 기준 상,하,좌,우 탐색
                    int nextI = i + dx[k];
                    int nextJ = j + dy[k];

                    if (map[nextI][nextJ] >= current) {
                        isTop = false; // 주변에 더 크거나 같은 값이 있으면 봉우리 탈락
                        break; // 나머지는 확인할 필요 X
                    }

                }

                // 봉우리라면 카운트 증가
                if (isTop) count++;

            }
        }

        return count;
    }
}
