package doitAlgorithm.기초;

public class 다중조건정렬_Comparable_사용하기 {
    /**
     * 성적을 정렬한다.
     * 1. 영어점수 기준
     * 2. 영어 점수가 같으면 수학점수 기준
     */

    public class Score implements Comparable<Score> {

        int english;
        int math;

        public Score(int math, int english) {
            this.math = math;
            this.english = english;
        }

        @Override
        public String toString() {
            return "Score { english=" + english + ", math=" + math + "}";
        }

        // Comparable interface에 비교하는 메서드가 있음
        @Override
        public int compareTo(Score next) {
            if (this.english == next.english) return next.math - this.math; // 현재 영어점수와 파라미터의 영어점수가 동일하면, 파라미터에 수학점수에서 현재 수학점수를 뺀다?
            return next.english - this.english; // 영어점수가 서로 다르면, 파라미터의 영어점수에서 현재 영어점수를 뺀다.
        } // 비교하는 메서든데 왜 값을 빼는거야?
    }

    public static void main(String[] args) {

    }
}
