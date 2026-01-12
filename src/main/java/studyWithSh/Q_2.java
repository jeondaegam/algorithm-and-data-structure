package studyWithSh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2 {
    /**
     * 문장 속 단어
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            String a = arr[answer];
            String b = arr[i];

            if (b.length() > a.length()) {
                answer = i;
            }
        }
        System.out.println(arr[answer]);
    }
}

// 1. 문자열을 입력받는다.
// 2. 공백을 기준으로 split 하여 배열에 저장한다.
// 3. 차례대로 length를 비교한다.
// 4. 길이가 더 긴 단어를 만나면 배열의 인덱스를 저장한다.
// 5. 출력한다.
// 시간복잡도 O(N)

