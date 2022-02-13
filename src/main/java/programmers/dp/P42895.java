package programmers.dp;

/**
 * N으로 표현
 * https://programmers.co.kr/learn/courses/30/lessons/42895
 */
public class P42895 {

    private int answer;
    private int number;

    public int solution(int N, int number) {
        this.answer = -1;
        this.number = number;
        dfs(N, 0, 0);
        return answer;
    }

    private void dfs(int N, int count, int sum) {
        if (count > 8) return;
        if (this.number == sum) {
            // 정답
            if (this.answer == -1) {
                answer = count;
            } else {
                this.answer = Math.min(this.answer, count);
            }
        }

        int X=N;
        for(int i=1;i<=8-count;i++) {
            dfs(N,i+count,sum+X);
            dfs(N,i+count,sum-X);
            dfs(N,i+count,sum*X);
            dfs(N,i+count,sum/X);
            // 사용된 5의
            X = (10 * X) + N;
        }
    }

}
