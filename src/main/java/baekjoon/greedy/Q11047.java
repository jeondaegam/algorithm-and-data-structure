package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("동전 종류의 개수와 받고싶은 금액을 입력하게 .");
        String[] str = br.readLine().split("\\s");

        int[] coinBank = new int[Integer.valueOf(str[0])];
        int count = 0;
        int temp = Integer.valueOf(str[1]);
        System.out.println("동전의 화폐단위를 작은 수부터 오름차순으로 입력하게 . ");
        for (int i = 0; i < coinBank.length; i++) {
            coinBank[i] = Integer.valueOf(br.readLine());
        }

        System.out.println("입력이 완료되었군 .");

        for (int i = coinBank.length - 1; i >= 0; i--) {
            // 나눈 몫은 동전개수가 된다 : + count에
            System.out.printf("%d원 - ", coinBank[i]);
            count += temp / coinBank[i];
            System.out.printf("%d\n", count);
            // 나머지는 다음 계산값이 된다 : = temp에
            temp = temp % coinBank[i];

        }
        System.out.printf("%s원을 만드는 데 필요한 동전의 개수는 %d개로군 .\n", str[1], count);
//        System.out.printf("%d", count);


    }
}
