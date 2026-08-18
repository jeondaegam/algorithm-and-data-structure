package programmers.고득점KIT.정렬;

import java.util.Arrays;

public class H_Index {
    /**
     *
     * 시간복잡도
     * H-Index의 citations 길이는 최대 1,000
     *
     *N = 1,000
     *
     * O(N²)
     * → 1,000 × 1,000 = 1,000,000
     * → 충분히 가능 ⭕
     *
     * O(N log N)
     * → 당연히 가능 ⭕
     *
     * O(N)
     * → 가능 ⭕
     *
     *이번 문제는 굳이 복잡한 최적화 방법을 찾을 필요가 없다.
     *
     *
     * H = 0부터 시작
     *  ↓
     * H번 이상 인용된 논문을 센다
     *  ↓
     * 그 개수가 H 이상인가?
     *  ↓
     * 맞으면 H를 저장
     *  ↓
     * H를 증가시킨다
     */
    public static void main(String[] args) {

        // 1 부터 n까지 반복하면서
        // 가장 큰 인용횟수를 찾는다.
        // 다만 조건은 h번 이상 인용된 논문이 h번 이상 있어야한다.

        // 논문별 인용횟수 배열 citations
        // 논문 개수 N

//        for (논문 수만큼 반복) {
//            i번 이상 인용된 논문 개수를 세어본다.
//
//            i번 이상 인용된 논문 개수가 i개 이상이라면?
//                    h 에 i 저장
//        }
//
//        가장 큰 h 값을 출력한다.
        int[] citations = {3, 0, 6, 1, 5};
        int answer = solution(citations);
        System.out.println(answer);
    }

    private static int solution(int[] citations) {

        // 정렬

        // N = 논문 개수
        // 논문 개수만큼 돌면서
        // 현재 숫자 뒤에 있는 논문 개수를 구한다.

        //
        Arrays.sort(citations);

        int N = citations.length;

        for (int i = 0; i < N; i++) {

            int count = N - i;

            if (citations[i] >= count) {
                return count;
            }
        }

        return 0;

    }


//    private static int solution(int[] citations) {
//        int N = citations.length;
//        int hIndex = 0;
//
//        for (int h = 0; h <= N; h++) {
//            int count = 0;
//            for (int j = 0; j < N; j++) {
//                // i 를 하나씩 바꿔가면서 배열 전체를 서치해야함
//                if (citations[j] >= h) { // i보다 크거나 같은 경우
//                    count++;
//                }
//
//            }
//            if (count >= h) {
//                hIndex = h;
//            }
//        }
//
//        return hIndex;
//    }

}
