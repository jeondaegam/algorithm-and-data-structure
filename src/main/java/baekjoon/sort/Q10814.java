package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();

        //1. 회원 명단을 입력받는다. {나이, 이름}
        // 2. 나이와, 이름을 가지고 Member 객체를 생성한다.
        // 3. list에 추가한다.
        // 4. 나이순으로 정렬한다. - list.sort(Comparator) <- 이거 처음봐, java 라이브러리임??
        // 5. 차례대로 출력한다.

        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");

            int age = Integer.parseInt(input[0]);
            String name = input[1];
            Member member = new Member(age, name);

            list.add(member);
        }

        list.sort(Comparator.comparing(Member::getAge));

        StringBuilder sb = new StringBuilder();
        for (Member m : list) {
            sb.append(m.getAge()).append(" ").append(m.getName()).append("\n");
        }

        System.out.println(sb);


    }


    static class Member {
        String name;
        int age;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

}
