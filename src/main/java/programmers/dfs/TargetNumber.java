package programmers.dfs;

public class TargetNumber {

    public static void main(String[] arg) {

        TargetNumber t = new TargetNumber();
        int answer = t.bfs(new int[] {1,1,1,1,1}, 3, 0, 0);

        System.out.println(answer);

    }

    public int bfs(int[] numbers, int target, int sum, int i) {

        if(i == numbers.length) {
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;
        result += bfs(numbers, target, sum+numbers[i], i+1);
        result += bfs(numbers, target, sum-numbers[i], i+1);
        return result;

    }

}
