package codeUp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*

          [기초-입출력] 연월일 입력받아 그대로 출력하기

          C 언어 )
          scanf("%d.%d.%d", &a, &b, &c);
          printf("%04d.%02d.%02d", a, b, c);

*/

public class Q_1019 {

    public static void main(String[] args) throws ParseException {


        //1. 입력받는다.
//        String inputString = new Scanner(System.in).next("[0-9]+\\.[0-9]+\\.[0-9]+");

        System.out.println("연,월,일 을 입력하세요");
        // 공백이나 . 으로 문자열을 분리한다.
        // 우리가 입력할 때 엔터키를 침으로써 입력이 끝났다는 걸 알리지만 컴퓨터는 개행문자로 받아들임.
        // 그렇기 때문에 공백문자도 delimiter에 포함시켜야 한다.

//        Scanner scan = new Scanner(System.in).useDelimiter("\\s|\\.");
//        int year = scan.nextInt();
//        int month = scan.nextInt();
//        int day = scan.nextInt();

//        System.out.println("year :" + year);
//        System.out.println("month :" + month);
//        System.out.println("day :" + day);
        // %04d > 4자리의 숫자를 표시하는데, 4자리가 되지 않을 경우 0으로 채운다.
//        System.out.printf("%04d.%02d.%02d", year,month,day);


//        Scanner scan = new Scanner(System.in).useDelimiter("\\s|\\.");
//        Scanner scan = new Scanner(System.in);
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String year2 = "1991";
        Date date = new Date(String.valueOf(yearFormat.parse(year2).getTime()));

//        Date yearDate = java.sql.Date.valueOf("1991");
//        int year = scan.nextInt();
//        int month = scan.nextInt();
//        int day = scan.nextInt();
        System.out.println(date.toString());


//
//        Date date = new Date();
//        System.out.printf("%tY.%tm.%td", date, date, date);

//        String result = valueOfDate(inputString);
//        System.out.println(result);

    }

    // 입력 받은 날짜를 아래의 포맷으로 변경한다.
    // => yyyy.MM.dd
    private static String valueOfDate(String inputString) {
        String[] strings = inputString.split("\\.");
        String year = strings[0];
        String month = strings[1];
        String day = strings[2];
        if (year.length() <= 2) {
            year = "00" + year;
        }

        if (month.length() < 2 && !month.startsWith("0")) {
            month = "0" + month;
        }
        if (day.length() < 2 && !day.startsWith("0")) {
            day = "0" + day;
        }

        return year + "." + month + "." + day;
    }
}
