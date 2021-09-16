package leetCode.medium;

import java.util.Arrays;

public class Q1310XorQueriesOfaSubarray {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 8};
//        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}}; // 2차원 배열 for문으로 돌릴 때 각 index에 어떻게 접근하는지?
        int[] arr = {4,8,2,10};
        int[][] queries = {{2, 3},{1,3},{0,0},{0,3}};

        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }



    private static int[] xorQueries(int[] arr, int[][] queries) {

        int[] preXor = new int[arr.length]; // arr만큼의 배열 선언
        preXor[0] = arr[0]; // 배열에 arr의 첫버째 값을 저장.
        for (int i = 1; i < arr.length; i++) preXor[i] = preXor[i - 1] ^ arr[i];
        // i = 1~3까지 loof
        //       result[0] =  arr[0] ==> 1;
//        i = 1; result[1] = result[0]^arr[1] ==> 1^3
//        i = 2; result[2] = result[1]^arr[2] ==> 1^3 ^4
//        i = 3; result[3] = result[2]^arr[3] ==> 1^3^4 ^8


        int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            answers[i] = preXor[r];
            if (l > 0) answers[i] ^= preXor[l - 1];
        }

        return answers;
    }



/*

            System.out.println("int => " +i);
            for (int j = queries[i][0]; j <= queries[i][1]; i++) {
                System.out.println(arr[j] +",");
                answer[i] ^= arr[j];
            }
            System.out.println();

        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
*/

    /*private static int[] xorQueries(int[] arr, int[][] queries) {
        int answer[] = new int[arr.length];

        for (int i = 0; i < queries.length; i++) {
            for (int start=i; i+1; i++)
            answer[i] = arr[i] ^ arr[i + 1];
        }
        return answer;
    */

}



