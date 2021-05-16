package codeUp;

import java.util.Scanner;

public class Quest1026 {
/*
    시분초 입력받아 분만 출력하기
    ---------------------------
    int h, m, s;
    scanf("%d:%d:%d", &h, &m, &s);
    를 실행하면 콜론을 사이에 둔 형식으로 입력되어, h, m, s에 각각 정수값만 저장된다.
    ---------------------------

    입력예시
    17:23:57

    출력 예시
    23

    */
    public String returnMinute(String timeStamp) {
        return timeStamp.split(":")[1];
    }

    public static void main(String[] args) {
        System.out.println("시간:분:초를 입력하세요.");
        Scanner scan = new Scanner(System.in).useDelimiter(":|\\s");
        scan.next();
        String middleTime = scan.next();
        scan.next();

        System.out.println("분 => :" + middleTime);
    }


    /*    public void printMinute() {
            System.out.println("시간:분:초를 입력하세요.");
    //        Scanner scan = new Scanner(System.in).useDelimiter("[0-9]+:[0-9]+:[0-9]+|\\s");
            Scanner scan = new Scanner(System.in).useDelimiter(":|\\s");
            scan.next();
            String middleTime = scan.next();
            scan.next();

            System.out.println("분 => :" + middleTime);

        }*/
}
