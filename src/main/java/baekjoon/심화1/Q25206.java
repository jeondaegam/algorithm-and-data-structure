package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25206 {

    public static void main(String[] args) throws IOException {
        // 전공 평점 출력하기
        // 과목명/학점/등급

        // 평점 계산법
        // 평점합계 = (3학점 * A+(4.5)) + (2학점 * B+(3.5)) = 20.5
        // 평점평균 = 평점합계(20.5) / 신청학점(5) = 4.1

        // 1. 20번 반복하며 입력받는다
        // 2. spilt()으로 과목의 학점과 등급을 추출한다
        // 2-1. 등급에 해당하는 점수를 구한다

        //3. 평점을 계산한다: 학점 * 평점
        //4. 학점을 누적해서 더한다(이따 평점낼때 필요)

        //5. P인 경우 아무것도 하지 않고 패스

        // 등급별 평점을 구한다.
        // 평균을 구한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputs = 20;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] gradeScores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        // 평점 합계
        double totalGrade = 0;
        // 평점 평균
        double everageGrade = 0;
        // 신청 학점
        double totalScore = 0;

        // 과목의 학점과 등급을 입력받는다
        for (int i = 0; i < inputs; i++) {
            String input = br.readLine();
            // 학점
            double score = Double.parseDouble(input.split(" ")[1]);
            // 등급
            String grade = input.split(" ")[2];

            // 등급과 매핑되는 점수를 구한다
            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    // 평점합계 계산
                    totalGrade += score * gradeScores[j];
                    // 신청학점 증가
                    totalScore += score;
                }
            }
        }

        br.close();
        // 평점 평균 = 평점합계 / 신청학점
        everageGrade = totalGrade / totalScore;
        System.out.printf("%.6f",everageGrade);
    }

}
