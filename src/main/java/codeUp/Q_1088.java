package codeUp;

public class Q_1088 {
/*

    [기초-종합] 3의 배수는 통과?

    1부터 입력한 정수까지 1씩 증가시켜 출력하고,
    3의 배수인 경우는 출력하지 않도록 만들어보자.

    참고
    반복문 안에서 continue;가 실행되면 그 아래의 내용을 건너뛰고, 다음 반복으로 넘어간다.

    입력 예시
    10

    출력 예시
    1 2 4 5 7 8 10
 */

    public static void main(String[] args) {
        solution(10);

//        System.out.println("정수를 입력하세요");
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }
    }


        private static void solution (int num){

            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
