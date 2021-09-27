package leetCode.easy;

public class Q1791FindCenterOfStarGraph {
/*
    we only need to compare edges[0] and edges[1]

    center 노드는 모든 노드와 연결되어 있다는 점을 이용!

    어차피 센터노드만 찾으면 되니까 가장 첫번째 요소인 00과
    그 다음 행의 10,11을 비교한다.

     중복되는 수가 있다면 ?
     -> 00이 센터노드,
     -> 없다면? 01이 센터노드

*/
    public static void main(String[] args) {
        System.out.println(findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}})); //4행2열
    }

    public static int findCenter(int[][] edges) {

        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }

}
