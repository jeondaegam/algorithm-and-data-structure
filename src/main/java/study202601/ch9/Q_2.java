package study202601.ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2 {
    /**
     * 회의실 배정
     */
    public static void main(String[] args) throws IOException {
        /**
         *     1. 한개의 회의실에서 여러개의 회의를 해야한다.
         *     2. 회의마다 시작시간->종료시간이 있음
         *     3. 가능한 한 가장 많은 회의를 할 수 있도록 회의실 시간표를 짜보자
         *     - 조건: 회의 시간은 겹치면 안된다.
         *
         *     방법: 끝나는 시간이 빠른 회의부터 고른다.
         *
         *     * 빨리 시작하는 걸 먼저 넣어야 하지 않나?
         *     - 시작시간 기준: 시작은 빠르지만 끝이 늦으면, 이후 선택지가 다 막힌다
         *     - 끝나는 시간 기준: 끝나는 시간이 빠르면 다음 사용 기회 많아짐
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            // 한줄에 숫자 두개 입력받아서 split
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        int answer = getSolution(n, arr);
        System.out.println(answer);

    }

    private static int getSolution(int n, int[][] arr) {

        // 1. 끝나는 시간이 빠른 순으로 정렬한다.
        // 2. 맨 처음 요소를 저장한다. 카운팅 +1, lastEnd = 회의 종료 시간 저장
        // 3. 다음 요소를 하나씩 체크한다.
        //  - 회의 시작 시간을 이전 회의 종료 시간과 비교한다.
        //  - 이전 종료 시간과 같거나, 그 이후면 카운팅 +1, lastEnd 업데이트
        //  - 회의 시작시간이 이전 회의 종료시간보다 앞이면 탈락

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0]; // 끝 같으면 시작 빠른 순
            return a[1] - b[1]; // 끝나는 시간 기준 오름차순
        });

        int count = 0;
        int lastEnd = 0;

        // 2. 회의 선택
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= lastEnd) {
                count++;
                lastEnd = arr[i][1];
            }
        }
        return count;
    }
}

