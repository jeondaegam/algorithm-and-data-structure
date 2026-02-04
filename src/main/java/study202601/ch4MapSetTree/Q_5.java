package study202601.ch4MapSetTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q_5 {
    /**
     * K번째 큰 수
     */
    public static void main(String[] args) throws IOException {

        /**
         * 카드 N장 중에서 서로 다른 3장을 뽑는 모든 조합을 만들기
         * 그 조합들의 합 중에 K번 째로 큰 수를 구한다.
         *
         * 조건: 중복 X
         *
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] inputArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = getSolution(N, K, inputArr);
        System.out.println(answer);


    }

    private static int getSolution(int N, int K, int[] inputArr) {
        /**
         *
         *  1. 카드 3장을 뽑는 모든 조합을 만든다.
         *  2. 각 조합의 합을 TreeSet에 저장한다. (중복 제거 + 내림차순 정렬)
         *  3. 큰 수부터 순서대로 꺼내며 K번째 값을 찾는다.
         *  4. K번째가 없다면 -1 반환.
         *
         *  TreeSet: Set과 동일한 자동으로 정렬해주는 Set
         *  값을 넣는 순간 오름차순으로 정렬한다.
         *
         */


        // 내림차순으로 정렬하는 Set을 선언
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    set.add(inputArr[i] + inputArr[j] + inputArr[k]);
                }
            }
        }

        int rank = 0;
        for (int sum : set) {
            rank++;
            if (rank == K) {
                return sum;
            }
        }

        // K번째 값이 없으면
        return -1;
    }
}
