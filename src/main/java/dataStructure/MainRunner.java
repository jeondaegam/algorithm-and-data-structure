package dataStructure;

public class MainRunner {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        numbers.add(1, 15);
        numbers.add(3, 22);
        numbers.addFirst(8);
//        System.out.println(numbers.get(1));

        for(int i=0; i<=300; i++) {
            numbers.addLast(i);

        }


        System.out.println(numbers.toString());
        System.out.println("numbers의 size : " + numbers.size());
        System.out.println("몇번 인덱스에 있는가? :" + numbers.indexOf(99));


    }
}
