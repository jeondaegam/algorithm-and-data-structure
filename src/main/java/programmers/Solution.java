package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String A = st.nextToken();
            String B = st.nextToken();

            // 전부다 5로 바꾼 값을 더하고
            // 전부다 6으로 바꾼 값을 더하면 되지않을까?

            String minA = A.replaceAll("6", "5");
            String minB = B.replaceAll("6", "5");
            int minSum = Integer.parseInt(minA) + Integer.parseInt(minB);

            String maxA = A.replaceAll("5", "6");
            String maxB = B.replaceAll("5", "6");
            int maxSum = Integer.parseInt(maxA) + Integer.parseInt(maxB);

            System.out.println(minSum + " " + maxSum);
            // 가능한 최소합과 최대합을 구해라!
            // 최소합 : A, B 모두에서 6을 5로 바꾼 경우
            // 최대합 : A, B 모두에서 5를 6으로 바꾼 경우

            // 위 두 경우를 출력하면 됨

            // 1. 두 수를 입력받는다.

            // 2. 5 or 6이 있는지 체크한다.

            // 자릿수에 따라 1을 더하거나 뺴주면 될 것 같은데..


        }

    }
}




