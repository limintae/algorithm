package programmers.dfs;

public class TargetNumber {

    public int solution(int[] numbers, int target) {
        return this.bfs(numbers, target, 0, 0);
    }

    public int bfs(int[] numbers, int target, int sum, int i) {
        if (i == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int result = 0;
        result += bfs(numbers, target, sum + numbers[i], i + 1);
        result += bfs(numbers, target, sum - numbers[i], i + 1);
        return result;
    }

}
