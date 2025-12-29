package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        // 그룹단어의 개수 출력하기

        // 같은 알파벳이 연속으로 나오면 ok
        // 이전에 나왔던 알파벳이 중복으로 나오면 fail

        // 테스트 케이스 개수 T 를 입력받는다
        // T만큼 반복하면서 단어를 입력받는다

        // 단어를 한글자씩 잘라
        // 한글자씩 주머니에 넣는다
        // 주머니에 넣는 규칙
        // 1. 주머니가 비어있다
        // 2. 바로 이전 글자와 동일한 글자다

        // 버리는 경우
        // 3. 이전 글자와 다른 글자인데, 주머니에 있는 경우

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            char[] arr = new char[input.length()];
            arr[0] = input.charAt(0);

            for (int j = 0; j < arr.length; j++) {
//                if (arr.)
            }


        }


    }
}
