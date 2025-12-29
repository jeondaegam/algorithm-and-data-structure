package 이코테2021.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
/*
    기출 - Facebook 인터뷰 (시간제한 1초, 메모리제한 128MB, 풀이시간 30분)
    <문제> 곱하기 혹은 더하기
    첫째 줄에 여러 개의 숫자로 구성된 문자열 s가 주어진다.
    입력된 수로 만들어질 수 있는 가장 큰 수를 출력한다.

    <문제 해결 아이디어>
    피연산자가 0이 아닌경우 곱하기 연산이 값을 더 크게 만든다.
    따라서 두 수중 하나라도 1 이하인 경우에는 더하고, 모두 2 이상인 경우에는 곱한다.

    입력 예시
    02984

    출력예시
    576

    입력 예시
    567

    출력 예시
    210


*/

    /*
    중요 개념
    long sum = nums.charAt(1) - '0';
    // char형 변수에 숫자를 입력받은 경우 '0'의 아스키코드 값을 빼면 본래 입력받은 숫자로 변환된다.

    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();

        int sum = 0;

        for (int i = 0; i < nums.length(); i++) {
            int num = nums.charAt(i) - '0';
            if (sum == 0 || num == 0) {
                sum += num;
            } else {
                sum *= num;
            }
        }
        System.out.println(sum);


    }
}