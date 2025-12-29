package 이코테2021.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3 {
    // 공포도가 0에 가까울 수록 많은 그룹을 만들 수 있음

    public static void main(String[] args) throws IOException {
        // 나는 1부터 카운트 할 것 같음.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("모험가는 몇 명인가?");
        int adventurer = Integer.valueOf(br.readLine());

        System.out.println("각 모험가들의 공포도를 입력하게.");
        String[] fear = br.readLine().split("\\s");
        Arrays.sort(fear);
//        System.out.println(Arrays.toString(fear));

        int group = 0;
        int count = 0;
        for (int i = 0; i < fear.length; i++) {
            count++;

            if (count >= Integer.valueOf(fear[i])) {
                group += 1;
                count -= Integer.valueOf(fear[i]);
            }
        }

        System.out.println("group :" + group);


    }
}
