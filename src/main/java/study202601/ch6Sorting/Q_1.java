package study202601.ch6Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1 {
    /**
     * 선택정렬 (Selection Sort)
     *
     * 매 단계마다 가장 최소값을 선택한 후, 오름차순으로 정렬한다.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for (int num : getSolution(N, arr)) {
            System.out.printf("%d ", num);
        }

    }

    private static int[] getSolution(int N, int[] arr) {
        /*
            1. i번째 자리에 들어갈 최소값을 찾는다.
            2. i 이후 구간에서 최소값의 위치(minIndex)를 찾는다.
            3. i와 minIndex를 swap한다.
            4. i를 1 증가하고 반복한다.

            시간복잡도: O(N^2)
         */

        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            int min = arr[i];


            // 배열을 돌며 최소값 찾기
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // i와 최소값을 swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        return arr;
    }
}
