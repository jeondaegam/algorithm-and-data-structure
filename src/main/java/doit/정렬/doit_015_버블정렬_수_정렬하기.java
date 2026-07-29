package doit.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class doit_015_버블정렬_수_정렬하기 {
    /**
     * 수 정렬하기 1 (오름차순 정렬)
     * 백준 온라인 저지 2750번
     * 시간제한 2초
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수의 개수
        int[] nums = new int[N];

        // 수 입력받기
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 버블정렬
        for (int i = 0; i < N; i++) { // N번 반복

            // 두 수를 비교 후 큰 수를 뒤로 보내자
            for (int j = 0; j < N - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }


        }

        System.out.println(Arrays.toString(nums));

    }
}
