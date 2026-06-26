package doitAlgorithm.배열과리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doit_001_숫자의합구하기 {
    /**
     * 숫자의 합 구하기
     * 백준 온라인 저지 11720
     * 시간제한 1초
     * 조건: 숫자의 개수 N(1 ≤ N ≤ 100)
     */
    public static void main(String[] args) throws IOException {
        /**
         * 정수의 개수 N을 입력받는다. (최대 100자리)
         * N개의 숫자를 한줄로 입력받아 String형 변수 input에 저장한다.
         * char형의 array로 변환해서 char[]형의 cArr에 각 숫자 값을 저장한다.
         * for(cArr)
         * {
         * 배열의 각 값을 정수형으로 변환 후 누적합을 sum에 저장한다.
         * }
         * sum을 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        char[] cArr = nums.toCharArray();
        int sum = 0;

        for (int i = 0; i < cArr.length; i++) {
            sum += cArr[i] - '0';// 48을 빼줘도 OK;
        }

        System.out.println(sum);

    }
}
