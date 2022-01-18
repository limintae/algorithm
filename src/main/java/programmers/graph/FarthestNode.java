package programmers.graph;

import java.util.LinkedList;
import java.util.Queue;

public class FarthestNode {

    public int solution(int n, int[][] edge) {
        return this.bfs(n, edge);
    }

    public int bfs(int n, int[][] edge){
        boolean[] visitedNode = new boolean[n];
        boolean[][] connectedEdgeMap = new boolean[n][n];
        Queue<Integer> nodeQueue = new LinkedList<>();

        for (int[] ints : edge) {
            connectedEdgeMap[ints[0] - 1][ints[1] - 1] = true;
            connectedEdgeMap[ints[1] - 1][ints[0] - 1] = true;
        }

        visitedNode[0] = true;
        nodeQueue.add(0);

        int answer = 0;
        while(!nodeQueue.isEmpty()) {
            int willVisitNodeCount = nodeQueue.size();
            for (int i = 0; i < willVisitNodeCount; i++) {
                int node = nodeQueue.poll();
                for (int j = 0; j < n; j++) {
                    if (connectedEdgeMap[j][node] && !visitedNode[j]){
                        visitedNode[j]=true;
                        nodeQueue.add(j);
                    }
                }
            }
            answer = willVisitNodeCount;
        }
        return answer;
    }

}
