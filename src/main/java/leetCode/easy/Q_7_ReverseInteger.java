package leetCode.easy;

public class Q_7_ReverseInteger {

    /*
       수를 입력받아, 역순으로 리턴한다.
       보통은,, String으로 변형 후 한자리씩 split..
        어렵다. 다시한번 풀어보기!
     */

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result *= 10; // *10을 해서 다음 값이 들어갈 자릿수를 만들어준다.
            result += x % 10; // x의 맨 뒷자리 값을 add
            x /= 10; // x를 10으로 나눠 맨 뒷자리 제거
        }
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
/*

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
*/

}
