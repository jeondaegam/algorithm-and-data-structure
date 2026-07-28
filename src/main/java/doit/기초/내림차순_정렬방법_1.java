package doit.기초;

import java.util.Arrays;
import java.util.Collections;

public class 내림차순_정렬방법_1 {
    /**
     * 클래스형으로 배열을 선언하면 쉽게 구현 가능하다.
     * Collections.reversOrder() 사용!
     */
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(Arrays.toString(arr));

    }
}


