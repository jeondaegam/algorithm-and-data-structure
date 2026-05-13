package doitAlgorithm.기초;

import java.util.Arrays;

public class 내림차순_정렬방법_2 {
    /**
     * 모든 값에 음수(-)를 매겨 오름차순 정렬한 다음, 다시 음수 부호를 제거
     * 핵심로직: 숫자값에 -1을 곱한다.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        negate(arr);
        Arrays.sort(arr);
        negate(arr);

        System.out.println(Arrays.toString(arr));

    }

    // TODO 변경된 배열을 리턴하지 않는데 값이 변경되는 이유: 배열은 참조 주소(Reference)를 전달하기 때문
    // 메서드 내부에서 값을 변경하면 원본 배열에 반영된다.
    private static void negate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
    }
}
