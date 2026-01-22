package studyWithSh.ch2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_3 {
    /**
     * 가위 바위 보
     */
    public static void main(String[] args) throws IOException {
        /*
        1. 게임횟수 N을 입력받는다.
        2. A에게 N개의 숫자를 입력받는다.
        2. B에게 N개의 숫자를 입력받는다.
        3. 게임별 승자를 출력한다.
        - 1: 가위, 2:바위, 3:보

        4. 두 숫자가 같은 경우: 무승부 (D)
        5. 승리 관계: 가위(1) -> 보(3) -> 바위(2) -> 가위(1)

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] aArr = br.readLine().split(" ");
        String[] bArr = br.readLine().split(" ");
        getSolution(N, aArr, bArr);

    }

    /**
     * 수식을 이용
     */
    private static void getSolution(int N, String[] aArr, String[] bArr) {
        int[] playerA = new int[N];
        int[] playerB = new int[N];

        // 숫자로 변환
        for (int i = 0; i < N; i++) {
            playerA[i] = Integer.parseInt(aArr[i]);
            playerB[i] = Integer.parseInt(bArr[i]);
        }

        for (int i = 0; i < N; i++) {

            int result = (playerA[i] - playerB[i] + 3) % 3;

            if (result == 0) System.out.println("D");
            else if (result == 1) System.out.println("A");
            else System.out.println("B");
        }
    }


    /**
     * A가 승리하는 조건만 작성 (1: 가위, 2:바위, 3:보)
     */
    private static void getSolution2(int N, String[] aArr, String[] bArr) {
        int[] playerA = new int[N];
        int[] playerB = new int[N];

        // 숫자로 변환
        for (int i = 0; i < N; i++) {
            playerA[i] = Integer.parseInt(aArr[i]);
            playerB[i] = Integer.parseInt(bArr[i]);
        }

        for (int i = 0; i < N; i++) {
            int A = playerA[i];
            int B = playerB[i];

            if (A == B) System.out.println("D");
            else if (A == 1 && B == 3) System.out.println("A");
            else if (A == 2 && B == 1) System.out.println("A");
            else if (A == 3 && B == 2) System.out.println("A");
                // 나머지는 모두 B가 승리
            else System.out.println("B");
        }

    }
}

