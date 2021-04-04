import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    private static int k = 0;
    private static int m = 0;

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int inputCnt = Integer.parseInt(input);
        int params[] = new int[inputCnt];
        for (int i = 0; i < inputCnt; i++) {
            params[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < params.length; i++) {
            k = 0;
            m = 0;
            fibonacci(params[i]);
            System.out.println(k + " " + m);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            k = k + 1;
            return 0;
        } else if (n == 1) {
            m = m + 1;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
