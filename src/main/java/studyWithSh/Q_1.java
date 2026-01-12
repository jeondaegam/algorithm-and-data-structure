package studyWithSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1 {
    /**
     * 문자 찾기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String[] input = br.readLine().toLowerCase().split("");
        String target = br.readLine().toLowerCase();

        for (String s : input) {
            if (s.equals(target)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

//1. 한 개의 문자열을 입력받는다
//2. 한 개의 글자를 입력받는다.
//3. 글자가 문자열에 몇번 포함되는지 카운팅 한다.

