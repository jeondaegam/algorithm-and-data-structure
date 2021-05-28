package apiPractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerFindInLine {

    // 입력 받은 문자열에서 특정 패턴의 문자를 가져온다.
    // https://www.geeksforgeeks.org/scanner-findinline-method-in-java-with-examples/

    public static void main(String[] args) {
        try {
            String s = "JeonDaegam has Scanner Class Methods";

            System.out.println("Target String:\n" + s);

            Scanner scan = new Scanner(s);
            System.out.println("\nAny 5 letter plus for : " + scan.findInLine(Pattern.compile(".......gam")));
            scan.close();
        } catch (IllegalStateException e) {
            System.out.println("Exception thrown : " + e);
        }
    }

}
