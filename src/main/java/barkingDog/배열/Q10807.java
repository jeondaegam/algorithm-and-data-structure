package barkingDog.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int target = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < length; i++) {
            int parsedNum = Integer.parseInt(st.nextToken());
            if (parsedNum == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
