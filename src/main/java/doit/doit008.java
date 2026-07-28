package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class doit008 {
    /**
     * 008: 좋은 수 구하기 (백준 1253)
     * 알고리즘: 투 포인터
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수의 개수 (1 <= N <= 2000)
        int[] arr = new int[N]; // 수를 입력받을 배열
        int count = 0; // 좋은 수의 개수

        st = new StringTokenizer(br.readLine());
        // 1. 배열 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 배열 정렬
        Arrays.sort(arr);

        // 3. 좋은 수 찾기
        for (int k = 0; k < N; k++) {
            // 투 포인터 초기화
            int left = 0;
            int right = arr.length - 1;
            int target = arr[k];

            while (left < right) {
                int sum = arr[left] + arr[right];

                // 1. target과 일치하는 두 합을 찾았을 떄
                if (sum == target) {

                    if (left != k && right != k) {
                        count++;
                        break; // while문 종료

                        // 정렬된 배열에 '0'이 있는 경우, 두 수의 합에 k 자신을 사용하는 것을 방지!
                    } else if (left == k) {
                        left++;
                    } else if (right == k) {
                        right--;
                    }
                }
                // 2. 아닐 때
                // 두 수의 합이 k보다 커지면
                else if (sum > target) {
                    // 큰수를 담당하는 j를 줄인다
                    right--;
                } else {
                    // 작은수를 담당하는 i를 늘린다
                    left++;
                }
            }

        }

        System.out.println(count);

    }
}

/* 기본 코드

    Arrays.sort(arr);

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int sum = arr[left] + arr[right];

        if (sum == target) {
            // 찾음
            break;
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }


 */