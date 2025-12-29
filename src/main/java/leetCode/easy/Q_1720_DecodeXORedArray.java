package leetCode.easy;

import java.util.Arrays;

public class Q_1720_DecodeXORedArray {

    public static int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] arr = new int[len + 1];

        arr[0] = first;

        for (int i = 0; i < len; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }

        return arr;
    }


    // my code
/*
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }

        return arr;
    }
*/


    public static void main(String[] args) {

        // 1,0,2,1
        System.out.println(Arrays.toString(decode(new int[]{1, 2, 3}, 1)));
        // 4,2,0,7,4
        System.out.println(Arrays.toString(decode(new int[]{6, 2, 7, 3}, 4)));

    }
}
