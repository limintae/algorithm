package programmers.greedy;

import java.util.*;

/**
 * 섬 연결하기
 * https://programmers.co.kr/learn/courses/30/lessons/42861
 */
public class P42861 {

    public int solution(int n, int[][] costs) {
        int answer = 0; // 다리를 만들때 필요한 최소비용
        // Greedy 알고리즘 최적화된 계산을 위하여 섬의 연결비용 순서대로 costs를 정렬한다.
        Arrays.sort(costs, Comparator.comparing(o1 -> o1[2]));

        //  Find Union 알고리즘 사용을 위한 섬들의 루트 연결정보
        int[] parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int[] edge : costs) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];

            int fromParent = findParent(parent, from);
            int toParent =  findParent(parent, to);

            // 연결이 되어있다면 continue (합집합에 속함)
            if (fromParent == toParent) continue;

            // 연결되어있지 않다면 건설
            answer += cost;
            // 최종적으로 parent가 모두 0이된다 (모두 연결되었다)
            parent[toParent] = fromParent;
        }

        return answer;
    }

    private int findParent(int[] parent, int targetNode) {
        if(parent[targetNode] == targetNode) return targetNode;
        return findParent(parent, parent[targetNode]);
    }

}
