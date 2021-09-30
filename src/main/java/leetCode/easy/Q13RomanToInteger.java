package leetCode.easy;

public class Q13RomanToInteger {

    public static void main(String[] args) {

//        String input ="MCMXCIV"; // 1994
        String input ="III"; // 3
        System.out.println("Input : " +input);
        System.out.println("Output : " + romanToInt(input));
    }

    private static int romanToInt(String s) {

        int len = s.length();
        int num = 0, ans = 0;

        for (int i = len - 1; i >= 0; i--) {
            switch (s.charAt(i)){
                case 'I' : num =1; break;
                case 'V' : num=5; break;
                case 'X' : num=10; break;
                case 'L' : num=50; break;
                case 'C' : num=100; break;
                case 'D' : num=500; break;
                case 'M' : num=1000; break;
            }

            /*
            * *4가 필요한 이유?
            * *4가 없다면 같은 기호가 연속으로 들어올 경우 앞서 계산한 값이 before numeral보다 커지기 때문에 더해야할 수를 감산해버린다. (III => 계산도중 2-1이 되버림)
            * num*4가 ans보다 작으면 감산해야한다. => 정확히 이해가 어려움 roman nnumerals가 1, 5, 10 5단위로 정해져있기때문인 것 같은데..*/
            if (num * 4 < ans) ans-= num;
            else ans += num;

        }
        return ans;
    }
}
