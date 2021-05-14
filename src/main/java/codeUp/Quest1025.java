package codeUp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quest1025 {
/*

    * 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
      다섯 자리로 이루어진 1개의 정수를 입력받는다.
      (단, 10,000 <= 입력받는 수 <= 99,999 )

    * 입력예시
      =>75254

    * 출력예시
      [70000]
      [5000]
      [200]
      [50]
      [4]

*/

    public void divideNumber(int num) {

        //1. 입력 조건을 확인한다.
        if (num < 10000 || num > 99999) return;

        //2. 한글자씩 잘라 array list에 넣는다.
        int[] arr = Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt).toArray();

        int multiplication = 10000;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] * multiplication + "]");
            multiplication = multiplication / 10;
        }

        // 배열 역순으로 변환
        // primitive type => object로 변경 (* boxing, unboxing 개념)
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> reverseList = Arrays.asList(integerArr);
        Collections.reverse(reverseList);
        System.out.println("reverse:" + reverseList);

    }

}

