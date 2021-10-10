package leetCode.easy;

public class Q58LengthOfLastWord {

    /*
    Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.

    Example 1:
    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.

     */


    public static void main(String[] args) {
//        System.out.println("Output: " + lengthOfLastWord("a ")); //1
        System.out.println("Output: " + lengthOfLastWord("Hello World"));
        System.out.println("Output: " + lengthOfLastWord("   fly me   to   the moon  "));
    }

    private static int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int space = 0;

        for (int i = len - 1; i >= 0; i--) {

            if (arr[i] == ' ') {
                if (i == len - 1 || arr[i + 1] == ' ') {
                    space += 1;
                } else {
                    return len - (i + 1) - space;
                }
            }

        }
        return 0;
    }

}



