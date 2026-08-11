package doit.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doit_퀵정렬_오름차순 {
    /**
     * <퀵정렬>
     * 시간복잡도: O(nlogn) ~ O(n^2)
     * <p>
     * 핵심이론: 하나를 기준으로 잡고, 작은 것과 큰 것을 양쪽으로 나누는 정렬
     * <p>
     * - 나눠진 그룹의 각각을 같은 방법으로 반복해서 정렬한다.
     * - 분할 -> 재귀적으로 정렬
     */

    static int[] arr;


    // start ~ end 범위를 퀵정렬
    private static void quickSort(int start, int end) {

        // 정렬할 값이 1개 이하면 종료
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        // 가운데 값을 피벗으로 선택
        int pivot = arr[(start + end) / 2];

        // 피벗을 기준으로 작은값은 왼쪽, 큰 값은 오른쪽
        while (left <= right) {

            // 피벗보다 큰 값을 찾을 때까지 left 화살표 이동                  :피벗보다 작은 숫자는 이미 왼쪽에 있으니까 지나감
            while (arr[left] < pivot) {
                left++;
            }

            // 피벗보다 작은 값을 찾을 때까지 right 화살표 이동                :피벗보다 큰 숫자는 이미 오른쪽에 있으니까 지나감
            while (arr[right] > pivot) {
                right--;
            }

            // 서로 위치를 바꿀 수 있다면 교환
            // 두 화살표가 만나지 않았다면                                 :left가 피벗보다 큰 값을 발견하거나 right가 피벗보다 작은 값을 발견해서 멈춰있는 상태인 것임
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // 분할이 끝나면
        // start ~ right : 왼쪽 그룹
        // left ~ end    : 오른쪽 그룹
        quickSort(start, right);
        quickSort(left, end);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 퀵정렬 호출
        // 양쪽을 분할해서 탐색하기때문에, 정렬범위의 시작점과 끝점을 알려준다.
        int start = 0;
        int end = N - 1;
        quickSort(start, end);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.print(sb);

    }

}
