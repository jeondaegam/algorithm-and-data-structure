package doit.배열과리스트;

import java.io.IOException;
import java.util.Scanner;

public class doit_002_평균구하기 {
    /**
     * 평균 구하기
     * 백준 온라인 저지 1546번
     * 시간제한 2초
     */
    public static void main(String[] args) throws IOException {

        // 점수 개수: 0 <= N <= 1000

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int N = Integer.parseInt(br.readLine());// 과목의 수
//        long sum = 0; // 점수 누적합
//        int max = 0; // 최고점
//
//        st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            int num = Integer.parseInt(st.nextToken(" "));
//            sum += num;
//            max = Math.max(max, num);
//
//        }
//
//        long result = sum * 100 / max / N;
//        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int max = 0; // 최대점수
        int sum = 0; // 점수총합
        int num = 0; // 각 과목별 점수

        for (int i = 0; i < N; i++) {
            num = scan.nextInt();
            max = Math.max(max, num);
            sum += num;
        }

        System.out.println(sum * 100.0 / max / N); // 100.0 <- 자동으로 double(소수점) 형식으로 계산함
//        System.out.println((double) sum / max * 100.0/ N); // int를 int로 나누게되서 이럴경우에는 double로 type cast 해줘야함

        // 식 도출 방법
        // 각 점수마다 새로운 점수를 구한 뒤 평균 계산
        // (40/max * 100) + (80/max * 100) + (60/max * 100) / 3

        // 모든 점수를 합산 후 반복되는 삭(max * 100 / 3)을 추출해 한번에 계산
        // 변경 식: (40+80+60) / max * 100.0 / 3(과목개수)
    }

}
