package baekjoon.incomplete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14487 {
    public static void main(String[] args) throws IOException {
//        System.out.println("이 섬에서 방문할 마을의 수를 입력하게 .");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.valueOf(br.readLine());
//
//        System.out.println("마을 간 거리를 입력하게 .");
//        int[] distance = Arrays.stream(br.readLine().split("\\s"))
//                .mapToInt(Integer::parseInt).toArray();
//        // 마을 간 총 거리를 구한 뒤
//        int sum = IntStream.of(distance).sum();
//        // 그중 가장 큰 값을 뺀다. -> 최대값을 제외한 모든 값이 연결되어, 해당 경로로 왕복할 수 있음.
//        int max = IntStream.of(distance).max().getAsInt();
//
//
//        System.out.println(sum-max);
        System.out.println("이 섬에서 방문할 마을의 수를 입력하게 .");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        System.out.println("마을 간 거리를 입력하게 .");
        String[] distance = br.readLine().split("\\s");
//        // 마을 간 총 거리를 구한 뒤
//        int sum = IntStream.of(distance).sum();
//        // 그중 가장 큰 값을 뺀다. -> 최대값을 제외한 모든 값이 연결되어, 해당 경로로 왕복할 수 있음.
//        int max = IntStream.of(distance).max().getAsInt();

        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(distance[i]);
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        System.out.println(sum - max);

    }
}
