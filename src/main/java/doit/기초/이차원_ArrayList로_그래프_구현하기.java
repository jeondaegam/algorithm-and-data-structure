package doit.기초;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 이차원_ArrayList로_그래프_구현하기 {
    /**
     * 그래프를 그릴 때 주로 사용한다.
     */


    // 1. 그래프의 에지를 표현하는 클래스 만들기
    static class Edge {
        int endNode; // 목적지 노드
        int value; // 가중치

        public Edge(int value, int endNode) {
            this.value = value;
            this.endNode = endNode;
        }
    }

    public static void main(String[] args) throws IOException {

        int nodeCnt = 3; // 노드 개수
        int edgeCnt = 4; // 에지(화살표) 개수

        // 2. 이차원 ArrayList 선언: ArrayList 타입의 '배열'을 선언한다.
        ArrayList<Edge> list[] = new ArrayList[10];


        // 3. 초기화(메모리 할당)
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 4. 그래프 데이터 저장하기
        for (int i = 0; i < edgeCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            list[startNode].add(new Edge(endNode, value));
        }

        // 5. 1번 노드의 그래프 데이터 가져오기
        for (int i = 0; i < list[1].size(); i++) {
            Edge temp = list[1].get(i);
            int endNode = temp.endNode;
            int value = temp.value;
        }


    }
}
