package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q_1181 {
    public static void main(String[] args) throws IOException {

        // 입력받은 단어를 아래의 기준대로 정렬하자

        // 1. 길이가 짧은 것부터
        // 2. 길이가 같으면 사전 순으로

        // 조건: 중복된 단어는 제거해야 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        // 2. 길이 우선
        // 3. 길이가 같으면 사전순 정렬

        // 1. 입력값의 중복 제거 (Set)
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(br.readLine().trim());
        }

        // 2. 리스트로 변환
        List<String> list = new ArrayList<>(set);

        // 3. 정렬
        list.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 사전 순
            }
            return a.length() - b.length();
        });


        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);

    }
}
