package studyWithSh.ch1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_10 {
    /**
     * 가장 짧은 문자거리
     */
    public static void main(String[] args) throws IOException {

        // 문자열 s와 문자 t를 입력받는다.
        // 'teachermode' e

//        t e a c h e r m o d e
//        0   2 3 4   6 7 8 9
//          1       5         10

        // 배열을 하나 만들고, 'e'와 같은 문자열을 찾으면 해당 인덱스를 배열에 저장한다.
        // 그러면 1, 5, 10 이 저장됨
        // 각 인덱스마다 1, 5, 10을 빼고, 가장 적은 값의 절대값을 출력해?!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        char[] word = input[0].toCharArray();
        char target = input[1].charAt(0);

        int[] answer = new int[word.length];

        List<Integer> indexesOfTarget = new ArrayList<>();

        // 1. 'e'가 들어있는 index 추출
        for (int i = 0; i < word.length; i++) {
            if (word[i] == target) {
                indexesOfTarget.add(i);
            }
        }

        int[] range = new int[indexesOfTarget.size()];

        // 배열 전체를 돌면서
        for (int i = 0; i < word.length; i++) {
            // 각 인덱스마다, 1,5,10을 빼고 그 값을 range에 저장
            for (int j = 0; j < indexesOfTarget.size(); j++) {
                range[j] = Math.abs(i - indexesOfTarget.get(j));
            }
            // range에서 가장 큰 값을 answer[i]에 저장
            int min = range[0];
            for (int k = 0; k < range.length; k++) {
                if (range[k] < min) {
                    min = range[k];
                }
                answer[i] = min;
            }
        }

        System.out.println(Arrays.toString(answer));

    }
}
