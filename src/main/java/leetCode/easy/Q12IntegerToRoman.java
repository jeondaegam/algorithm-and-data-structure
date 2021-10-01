package leetCode.easy;

public class Q12IntegerToRoman {
    public String intToRoman(int num) {

        // https://leetcode.com/problems/integer-to-roman/discuss/6274/Simple-Solution
        // 1 <= num <= 3999
        // 1 ~ 9
        // 10 ~ 90
        // 100 ~ 900
        // 1000 ~ 3999

        String M[] = {"", "M", "MM", "MMM"}; // 1000
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"  }; // 100
        String X[] = {"", "X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];

    }
}
