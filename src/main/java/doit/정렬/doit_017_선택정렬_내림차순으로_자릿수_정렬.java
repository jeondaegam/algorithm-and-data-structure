package doit.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class doit_017_선택정렬_내림차순으로_자릿수_정렬 {
    /**
     * 내림차순으로 자릿수 정렬하기
     * 백준 온라인 저지: 1427번
     * 선택정렬
     * 시간복잡도: O(N^2)
     *
     *
     * 핵심 이론:
     * 최대값을 찾았는데 위치가 다르면 교환한다.
     * 최솟값 또는 최댓값을 찾고, 남은 정렬 부분의 가장 앞에 있는 데이터와 swqp 한다.
     *
     *
     * 정렬범위 재정렬:
     * 루프마다 정렬범위를 하나씩 축소: 가장 앞에있는 인덱스의 위치를 변경한다. (index++)
     *
     *
     * 중요한점:
     * max값이 들어있는 인덱스 번호를 들고있는다!
     * 두 값을 swap하려면, max값이 들어있는 위치를 알아야 하기 때문.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        // 자릿수를 숫자로 형변환 후 배열에 저장
        int[] nums = new int[str.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < str.length; i++) {
            int max = i; // 현재 i를 최댓값으로 선택 (최댓값이 들어있는 인덱스 번호를 들고있는다)

            for (int j = i + 1; j < str.length; j++) { // i+1부터 끝까지 반복하면서 최댓값을 찾는다.
                if (nums[max] < nums[j]) {
                    max = j;
                }
            }

//            if (nums[i] < nums[max]) {
//                int temp = nums[i];
//                nums[i] = nums[max];
//                nums[max] = temp;
//            }
            /**
             * 위처럼 값을 비교하지 않고, max에 저장된 index가 i와 다르면? swap한다!
             *
             * 최대값을 찾았는데 위치가 다르면 교환한다.
             */
            if (max != i) {
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
            }

        }

        System.out.println(Arrays.toString(nums));


    }
}
