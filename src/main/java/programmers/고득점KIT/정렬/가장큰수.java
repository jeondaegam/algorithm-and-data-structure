package programmers.고득점KIT.정렬;

import java.util.Arrays;

public class 가장큰수 {

    /**
     *
     * 시간복잡도: O(N log N)
     *
     * 핵심이론
     *
     * 특별한 기준으로 전체 배열을 정렬해야 한다
     * ↓
     * Arrays.sort() 사용
     * ↓
     * 그런데 기본 정렬 기준으로는 안 됨
     * ↓
     * "두 숫자를 붙여서 더 큰 쪽이 앞" 이라는 비교 기준을 직접 만든다
     * ↓
     * Comparator
     *
     *
     * Arrays.sort() → 전체 배열을 정렬해주는 역할
     * Comparator → 두 요소를 어떤 기준으로 비교할지 알려주는 역할
     */

    public static void main(String[] args) {

        int[] numbers = {3, 30, 34, 5, 9};
//        int[] numbers = {6, 10, 2};
        String answer = solution(numbers);
        System.out.println(answer);

    }

    private static String solution(int[] numbers) {
        String answer = "";
        String[] numbersToStr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersToStr[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        // 숫자로 바꿔서 비교
//        Arrays.sort(numbersToStr, (x, y) -> {
//            int xy = Integer.parseInt(x + y);
//            int yx = Integer.parseInt(y + x);
//            // Comparator 규칙
//            // 음수 -> x를 앞에
//            // 양수 -> y를 앞에
//            // 0 -> 순서 같음
//            return yx - xy;
//        });

        // 문자열을 그대로 비교 (추천)
        Arrays.sort(numbersToStr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });

        // 출력
        StringBuilder sb = new StringBuilder();
        for (String num : numbersToStr) {
            sb.append(num);
        }
        answer = sb.toString();

        // 결과가 0일경우 0처리
        if (answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer;

    }
}
