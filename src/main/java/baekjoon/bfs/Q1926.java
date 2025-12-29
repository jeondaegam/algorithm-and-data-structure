package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1926 {

    static int n, m;
    static int[][] map;
    static boolean[][] visited;


    public static void main(String[] args) throws IOException {

        // 1. 입력, 전체 순회의 틀을 만든다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 문제 풀이 시작
        // 전체 그림을 순회하면서 그림의 시작점을 찾는다.

        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]) { // 새로운 그림을 발견하면
                    count++; // 카운트를 증가
                    int area = bfs(i, j); // 그림의 면적을 구한다.
                    maxArea = Math.max(maxArea, area); // 가장 큰 면적을 구함
                }
            }
        }

        br.close();
        System.out.printf("%d\n%d", count, maxArea);

    }

    private static int bfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        // 배열의 상하좌우로 칸 이동시 사용할 배열
        // 두 배열의 동일한 인덱스를 한 쌍으로 봐야함
        // 이 배열을 차례대로 0~3 인덱스를 반복하면 상하좌우 칸을 모두 방문할 수 있음

        Queue<int[]> queue = new LinkedList<>();

        // 방문할 좌표를 넣는다.
        queue.add(new int[]{x, y}); // int형 배열을 넣었음 [0]:x, [1]:y

        // 시작 좌표는 방문했다고 체크
        visited[x][y] = true;

        // 그림의 넓이 (시작 칸 포함이므로 1부터)
        int area = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            // 시작 좌표
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {

                // 다음으로 이동할 좌표
                int nextX = cx + dx[i]; // cx를 기준으로 상하좌우 이동
                int nextY = cy + dy[i];

                // 배열 범위를 벗어나면 무시
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;

                // 이미 방문한 칸이면 무시
                if (visited[nextX][nextY]) continue;

                // 값이 0이면 그림이 아니니까 무시
                if (map[nextX][nextY] == 0) continue;

                // map 범위 안
                // 방문 안했고
                // 그림(1)일 경우

                // 방문처리
                visited[nextX][nextY] = true;
                queue.add(new int[]{nextX, nextY}); // 다음에 탐색할 대상으로 추가
                area++; // 그림 넓이 증가

            }

        }
        // 이 bfs로 찾은 그림의 넓이 반환
        return area;
    }
}

/*
상하좌우 이동을 이해하는 게 중요하다.
- 이차원 배열에서 상하좌우를 방문 하는 방법


- 상태 정의
- 시작점: 0,0
- 종료 조건: 더이상 방문할 칸이 없을 때 (모든 칸의 visited = true)
- 반복 구조: 다음 방문할 칸이 있으면 (!queue.isEmpty())
- 예외 처리
- -> 복잡해 보이는 것을 틀로 정리할 수 있는지

 */