package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;

public class Q_1343 {
    // 폴리오미노
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer buffer = new StringBuffer();
        System.out.println("폴리노미오 보드를 입력하게 .");

        String[] polyomino = br.readLine().split("");
        System.out.println(Arrays.toString(polyomino));
        int polyCount = 0;

        String blockA = "AAAA";
        String blockB = "BB";

        for (int i = 0; i < polyomino.length; i++) {
            // X 블럭을 만나면 카운트 +1
            if (polyomino[i].equals("X")) {
                polyCount++;
                System.out.println("count: " + polyCount);
            } else {
                // X 블럭이 홀수개면 return
                if (polyCount % 2 == 1) {
                    System.out.println("-1");
                    return;
                }
                //앞에 X 블럭이 없었으면 "." 을 그려줌
                if (polyCount == 0) {
                    bw.write(".");
                } else {
                    bw.write(blockA.repeat(polyCount/4));
//                        result = result + markingA.repeat(count / 4);
                    if (polyCount % 4 > 0) {
                        bw.write(blockB);
                    }
//                        result = (count % 4 != 0) ? result + markingB : result + "";
//                        System.out.println("result: " + result);
                    polyCount = 0;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}


// if (polyomino[i] == "X") 배열 안에 있는 값은 값 자체를 비교하는거고 "X"는 참조 주소를 비교하는거라 false인가?