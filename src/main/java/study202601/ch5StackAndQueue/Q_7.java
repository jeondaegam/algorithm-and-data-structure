package study202601.ch5StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q_7 {
    /**
     * 교육과정 설계
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mustSubject = br.readLine();
        String[] planSubects = br.readLine().split("");

        String answer = getSolution2(mustSubject, planSubects);
        System.out.println(answer);

    }

    private static String getSolution(String requiredCourses, String[] plan) {

        // 1. 강의 계획에서 하나씩 꺼내 필수과목이면 큐에 저장
        // 2. 기존 필수과목이랑 순서가 동일한지 체크

        Deque<String> queue = new ArrayDeque<>();

        // 1. 강의 계획에서 필수과목만 뽑아 큐에 저장한다.
        for (String course : plan) {
            if (requiredCourses.contains(course)) {
                queue.offer(course);
            }
        }

        if (queue.isEmpty()
        || (queue.size() != requiredCourses.length())) return "NO";

        for (int i = 0; i < requiredCourses.length(); i++) {

            // 2. 필수과목과 강의계획의 순서가 다르면 실패
            if (requiredCourses.charAt(i)
                    != queue.poll().charAt(0)) {
                return "NO";
            }
        }
        return "YES";
    }

    // 정석 풀이
    private static String getSolution2(String requiredCourses, String[] plan) {

        // 1. 필수 과목 순서를 큐에 저장
        Deque<String> requiredQueue = new ArrayDeque<>();
        for (String course : requiredCourses.split("")) {
            requiredQueue.offer(course);
        }

        // 2. 수강 계획을 순서대로 확인
        for (String course : plan) {

            // 현재 과목이 필수 과목이면
            if (requiredCourses.contains(course)) {
                // 순서 비교 : 필수 과목 순서와 다르면 실패
                if (!requiredQueue.poll().equals(course)) {
                    return "NO";
                }
            }

        }

        // 반복문을 끝냈는데 필수과목 리스트에 과목이 남아있다면 실패
        if (!requiredQueue.isEmpty()) {
            return "NO";
        }

        return "YES";
    }

}

