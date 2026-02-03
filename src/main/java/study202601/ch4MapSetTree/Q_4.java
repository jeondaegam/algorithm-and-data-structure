package study202601.ch4MapSetTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_4 {
    /**
     * 모든 애너그램 찾기(HashMap, 투포인터, 슬라이딩 윈도우)
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputS = br.readLine();
        String inputT = br.readLine();
        int answer = getSolution(inputS, inputT);
        System.out.println(answer);

    }

    private static int getSolution(String line, String word) {
        int count = 0;

        // 기준이 되는 단어(T)의 문자 개수 저장
        Map<Character, Integer> wordMap = new HashMap<>();

        // 현재 윈도우(S 부분문자열)의 문자 개수 저장
        Map<Character, Integer> lineMap = new HashMap<>();

        // 1. word 문자 개수 세팅
        for (char c : word.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }

        int windowSize = word.length();

        // 2. 처음 WindowSize -1 만큼만 세팅 (2글자만 세팅됨)
        for (int i = 0; i < windowSize - 1; i++) {
            lineMap.put(line.charAt(i),
                    lineMap.getOrDefault(line.charAt(i), 0) + 1);
        }

        // 3. 슬라이딩 윈도우 시작
        int left = 0;

        for (int right = windowSize - 1; right < line.length(); right++) {
            // 오른쪽 문자 추가
            lineMap.put(line.charAt(right)
                    , lineMap.getOrDefault(line.charAt(right), 0) + 1);

            // 현재 윈도우가 아나그램인지 검사
            if (lineMap.equals(wordMap)) {
                count++;
            }

            // 왼쪽 문자 제거 → 다음 윈도우 준비
            char leftChar = line.charAt(left);
            lineMap.put(leftChar, lineMap.getOrDefault(leftChar, 0) - 1);
            if (lineMap.get(leftChar) == 0) {
                lineMap.remove(leftChar);
            }
            left++;
        }


        return count;
    }
}
