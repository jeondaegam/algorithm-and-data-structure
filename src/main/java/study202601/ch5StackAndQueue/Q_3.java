package study202601.ch5StackAndQueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_3 {

    /**
     * 크레인 인형뽑기(카카오)
     */
    public static void main(String[] args) throws IOException {
        /*
         * N x N 보드를 입력받는다
         * 크레인 이동 순서(moves)에 따라 인형을 뽑는다
         * 같은 인형이 연속으로 쌓이면 제거된다
         * 제거된 인형의 총 개수를 출력한다
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 보드크기 N 입력
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        // N * N 보드 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 크레인의 이동 횟수
        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];

        // 크레인 이동 순서가 담긴 배열 moves[]
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        int answer = getSolution(N, board, moves);
        System.out.println(answer);
    }

    private static int getSolution(int N, int[][] board, int[] moves) {
        // 인형을 넣을 스택 생성
        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        // 크레인 이동 순서대로
        for (int move : moves) {

            // 해당 열을 위에서부터 탐색
            for (int i = 0; i < N; i++) {
                int doll = board[i][move - 1];

                if (doll > 0) { // 인형 발견
                    board[i][move - 1] = 0; // 인형 뽑고 빈칸처리

                    // 바구니의 top과 같으면 pop
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer += 2; // 인형 2개 제거
                    } else {
                        basket.push(doll); // top과 다르면 push
                    }

                    break; // 한 번 뽑았으면 이 열은 끝
                }
            }
        }

        return answer;
    }
}
