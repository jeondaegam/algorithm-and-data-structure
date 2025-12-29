package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_2178 {

    static int n, m;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        /*
        1 = 갈 수 있는 길
        0 = 못 감

        (n-1)(m-1) = 목적지
        최단거리를 구해야 함

         */

        // 1단계. 전체 틀 짜기

        // 2단계. bfs 시그니처 만들기

        // 3단계. bfs 기본구조 만들기


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];


        // 배열 입력받기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int result = bfs(0, 0);
        System.out.println(result);

    }

    static int bfs(int x, int y) {

        int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우 로 움직일 때의 이동거리
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, y}); // 첫 시작 좌표
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            // 현재 좌표 불러오기
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            // 4방향 체크 - 현재좌표 (cx,cy를 기준으로 상하좌우 좌표를 방문하며 1인지 체크)
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 범위 체크 (map 범위를 넘어가는지) : 벽체크
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                // 방문 체크
                if (visited[nx][ny]) continue;

                if (map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    map[nx][ny] = map[cx][cy] + 1;
                }


            }
        }

        return map[n - 1][m - 1];


    }
}
