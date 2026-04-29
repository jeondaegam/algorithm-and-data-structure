package doitAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit003 {
    /**
     * 003: 구간 합 구하기 1 (백준:11659)
     * 알고리즘: 누적 합 (Prefix Sum)
     * 시간복잡도: O(N + M)
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer: 공백 기준으로 토큰을 분리하는 클래스
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 숫자개수 (최대 100,000)
        int M = Integer.parseInt(st.nextToken()); // 질의개수 (최대 100,000)

        // 인덱스 1부터 사용 -> sumArr[0] = 0으로 초기화되어 경계 처리가 깔끔해짐
        int[] sumArr = new int[N + 1]; // 합배열

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            // 합배열 만들기
            int num = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i - 1] + num;
        }

        // 출력을 모아서 한 번에 출력 -> Syso보다 빠름
        StringBuilder sb = new StringBuilder();

        // 질의 개수만큼 반복
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            // 구간 입력받기
            int start = Integer.parseInt(st.nextToken()); // ✅ parseInt 사용 - 두 자리 이상 숫자도 올바르게 파싱
//            int start = st.nextToken().charAt(0) - '0';
            int end = Integer.parseInt(st.nextToken());

            // 구간합 출력하기
            sb.append(sumArr[end] - sumArr[start - 1]).append("\n");
        }

        System.out.print(sb);
    }
}

/*

Sudo code
--------------------------------------------

N(숫자개수), M(질의개수), sumArr(합배열,길이:N+1)

for (N번 반복, 1부터시작) {
    - 값 입력받기(num)
    - 합배열 만들기(sumArr[i] = sumArr[i-1] + num)
}

for (질의 개수만큼 반복(M)) {
    - 구간 입력받기 (start ~ end)
    - 구간합 구하기 (sumArr[end] - sumArr[start-1])
}

구간 합 출력하기

--------------------------------------------

- 전체 연산 횟수가 각각 N번, M번 이므로 시간복잡도는 O(N+M)이 된다.
- '정수 - charAt(0)' 방식은 한 자리 숫자만 파싱된다.
- 입력이 '10'이면 charAt(0) = 10이 아닌 1로 읽힘 (charAt(0) <- 0번째만 가져오기때문)
 */
