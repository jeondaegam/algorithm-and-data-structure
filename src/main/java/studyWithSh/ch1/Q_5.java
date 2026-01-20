package studyWithSh.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5 {
    /**
     * 특정문자 뒤집기
     */
    public static void main(String[] args) throws IOException {
        // 문자열을 입력받는다.
        // 문자열의 첫글자와 마지막 글자에 포인터를 두고 시작한다.
        // 양 끝의 문자열이 알파벳일 때만 자리를 교환한다.
        // 그리고 양 끝의 포인터를 각각 +1, -1 해준다.
        // 알파벳만 뒤집힌 문자열을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        int start = 0;
        int end = arr.length - 1;
        char temp;

        while (start < end) {
            if (Character.isLetter(arr[start]) && Character.isLetter(arr[end])) {
                // 양 끝이 모두 문자인경우
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (!Character.isLetter(arr[start])) {
                // 좌측 포인터가 기호일경우 다음으로 이동
                start++;
            } else if (!Character.isLetter(arr[end])) {
                // 우측 포인터가 기호일경우 다음으로 이동
                end--;
            }
        }

        System.out.println(arr);

    }
}
