package programmers.dfs;

/**
 * 네트워크
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Network {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] checks = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!checks[i]) {
                // 방문하지 않은 노드만 탐색
                dfs(computers, i, checks);
                answer++;
            }
        }
        return answer;
    }

    private boolean[] dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;
        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && !check[j]) {
                // 자기 자신 index는 제외, 노드의 네트워크가 연결되어있음, 아직방문하지 않았을 경우
                // 노드를 방문한다
                check = dfs(computers, j, check);
            }
        }
        return check;
    }

}
