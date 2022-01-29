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
                check = dfs(computers, j, check);
            }
        }
        return check;
    }

}
