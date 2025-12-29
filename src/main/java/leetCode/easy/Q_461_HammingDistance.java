package leetCode.easy;

public class Q_461_HammingDistance {

/*
    private static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
*/

    private static int hammingDistance(int x, int y) {

        int count=0;
        int xor=x^y;
        for (int i=0; i<32; i++){
            count+= (xor >> i) & 1;
            System.out.println(xor >> i);
        }
        return count;
    }


        public static void main(String[] args) {
        System.out.println("answer =" + hammingDistance(1,4));
    }
}
