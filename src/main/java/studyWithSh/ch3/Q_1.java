package studyWithSh.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1 {
    /**
     * 두 배열 합치기
     */
    public static void main(String[] args) throws IOException {
        /*
            [풀이 방법 - Two Pointer]

            1. 이미 오름차순으로 정렬된 두 배열이 주어진다.
            2. 두 배열을 다시 정렬하지 말고 합치자!

            3. p1, p2 두 포인터를 각 배열의 시작에 둔다.
            4. 두 포인터가 가리키는 값을 비교한다.
                - 더 작은 값을 결과에 추가하고 해당 포인터를 한 칸 이동한다.
            5. 한 배열이 끝나면 나머지 배열은 그대로 결과에 추가한다.

            반복 조건 !
            p1과 p2 모두 각자의 배열 사이즈를 넘지 않아야함

            - "이미 오름차순으로 정렬된 두 배열" 이라는 단서가 투 포인터를 사용하라는 의도

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputArr1 = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] inputArr2 = br.readLine().split(" ");

        String answer = getSolution(N, M, inputArr1, inputArr2);
        System.out.println(answer);

    }

    private static String getSolution(int N, int M, String[] inputArr1, String[] inputArr2) {

        int[] arr1 = Arrays.stream(inputArr1).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(inputArr2).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();

        int p1 = 0, p2 = 0;

        // 두 배열 모두 원소가 남아 있는 동안 비교
        while (p1 < N && p2 < M) {
            if (arr1[p1] <= arr2[p2]) {
                sb.append(arr1[p1++]).append(" ");
            } else {
                sb.append(arr2[p2++]).append(" ");
            }
        }

        // 어느 한 배열의 순회가 끝나고 나머지 배열만 남으면

        // arr1에 남은 값들 처리 (arr1의 원소가 남은 경우)
        while (p1 < N) {
            sb.append(arr1[p1++]).append(" ");
        }

        // arr2에 남은 값들 처리 (arr2의 원소가 남은 경우)
        while (p2 < M) {
            sb.append(arr2[p2++]).append(" ");
        }

        return sb.toString().trim();
    }
}
