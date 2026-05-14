package doitAlgorithm.배열과리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doit_001 {
    /**
     * 숫자의 합 구하기
     * 백준 온라인 저지 11720
     * 시간제한 1초
     */
    public static void main(String[] args) throws IOException {

        // 숫자의 개수를 최대 100개 입력받는다.
        // 최대 100자리의 숫자를 입력받아야 하므로 숫자형이 아닌 String을 사용하자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String stringNum = br.readLine();
        char[] nums = stringNum.toCharArray(); // split을 거치지 않고 char array로 변환 가능
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            int num = nums[i] - '0';
            sum += num;
        }

        System.out.println(sum);
    }
}

/**
 * 정수의 개수 N을 입력받는다.
 * N개의숫자를 한줄로 입력받는다. (최대 100개 까지 받을 수 있으므로 string으로 저장)
 * char[] 타입으로 형변환한다.
 * 각 값의 누적 합을 누한다.
 */