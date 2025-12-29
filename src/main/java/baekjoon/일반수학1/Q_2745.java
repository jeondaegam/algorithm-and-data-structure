package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2745 {
    public static void main(String[] args) throws IOException {

        // 1181번

        // 1. 숫자 N을 입력받는다.
        // 2. N번만큼 단어를 입력받는다
        // 3. 배열 a에 단어별 길이를 저장한다
        // 4. a를 오름차순으로 정렬하는데, index를 저장한다.

//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        // 1.
/*            int N = Integer.parseInt(br.readLine());
            String[] words = new String[N];
            int[] lengthOfWord = new int[N];

            for (int i = 0; i < N; i++) {
                // 2. 단어 입력받자
                words[i] = br.readLine();

                // 3. 단어의 길이를 저장
                lengthOfWord[i] = words[i].length();
            }



            // 숫자를 입력받아 numbers에 넣는다.
            int[] numbers = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // sort
            Arrays.sort(numbers);

            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);

            }*/
//        }

        // 1. 상근이의 카드 개수 N을 입력받는다.
        // 2. N개의 카드를 입력받는다.

        // 3. 랜덤 카드 개수 M을 입력받는다.
        // 4. M개의 카드를 입력받는다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1.
        int N = Integer.parseInt(br.readLine());

        // 2.
        int[] cards = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 3.
        int M = Integer.parseInt(br.readLine());

        // 4.
        int[] dummy = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


    }
}