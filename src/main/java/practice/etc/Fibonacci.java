package practice.etc;

public class Fibonacci {

    public static void main(String[] args) {
        int[] know = new int[7];
        int result = fibonacci(6, know);
        System.out.println(result);
    }

    private static int fibonacci(int n, int[] know) {
        if (n <= 1) return n;

        if (know[n] != 0) {
            // 계산된 결과라면
            return know[n];
        } else {
            return know[n] =  fibonacci(n - 1, know) + fibonacci(n - 2, know);
        }
    }

}
