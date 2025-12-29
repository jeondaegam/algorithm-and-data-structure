package barkingDog.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_3273 {
    public static void main(String[] args) throws IOException {
        // n개의 정수를 한줄로 입력받는다.
        // 자연수 x를 입력받는다.
        //  ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하라

        // i는 뭐고 j는 뭐지??

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }

            // sum이 x보다 작으면: left +1
            // sum이 x와 같으면: 양쪽을 +1
            // sum이 x보다 크면: right + 1
        }

        System.out.println(count);

    }
}
