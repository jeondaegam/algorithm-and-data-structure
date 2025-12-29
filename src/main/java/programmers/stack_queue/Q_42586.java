package programmers.stack_queue;

import java.util.Arrays;

public class Q_42586 {
    public static void main(String[] args) {

        int[] arr = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(arr, speeds);

        System.out.println(Arrays.toString(answer));
    }

    // 작업 진도는 100%가 되면 배포 가능
    // 하루에 speeds 만큼 작업 진도 증가
    // 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발 완료 될 수 있음
    // 배포는 하루에 한번만 가능
    // 뒤에 있는 기능이 앞의 기능보다 먼저 개발 완료되더라도 앞의 기능이 배포될 때 함께 배포


    // progresses를 순회하면서 작업진도 요소에 speed를 더해준다.
    // 작업 진도가 100 이상이 되면 배포 가능한 상태

    // 100 이상이 되면 배포 카운트를 눌러준다.

    // 카운트가 1이상이면 배포 리스트에 추가한 뒤 초기화 한다.


    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int[] dayOfEnd = new int[100];
        int day = -1;

        for (int i=0; i<progresses.length; i++) {
//            while (progresess[i] + )
        }

        for (int i = 0; i < progresses.length; i++) {

            while (progresses[i] < 100) {

            }
            if (progresses[i] >= 100) {

            }

        }

        return answer;
    }
}
