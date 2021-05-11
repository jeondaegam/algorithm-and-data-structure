package dataStructure;

import java.util.Arrays;

public class ArrayList {
    private Object[] elementData = new Object[100];
    private int size = 0; // 몇 개의 값이 채워졌는지 체크

    // 데이터를 마지막에 추가한다.
    public boolean addLast(Object element) {
        //사이즈가 풀인지 체크
        if (size >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length + 100);
            System.out.println("늘어난 배열 사이즈 : " + elementData.length);
        }
        elementData[size] = element;
        size++;
        return true;
//        }
    }

    public boolean add(int index, Object element) {

        for (int i = size - 1; i >= index; i--) { // for문은 index값 까지 돌아야 함.
            // elementData[i] = elementData[i - 1]; // 0번째 인덱스에 값을 추가할 때 에러
            elementData[i + 1] = elementData[i];
        }

        // add element to index
        elementData[index] = element;
        size++;

        return true;
    }


    public boolean addFirst(int num) {

//        for (int i = size; i <= 0; i--) {
//            elementData[i] = elementData[i - 1];
//        }
//        elementData[0] = num;
//        return true;
        return add(0, num);
    }

    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public String toString() {
        String elementStr = "";

        for (int i = 0; i < size; i++) {
            elementStr += elementData[i] + ",";
        }
        elementStr = elementStr.substring(0, elementStr.length() - 1);

        return "[" + elementStr + "]";
    }

    public int size() {
        return size;
    }


    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) return i;
        }
        return -1;
    }
}
