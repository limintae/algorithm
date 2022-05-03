package practice.etc;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n <= 1) return n;
        return factorial(n - 1) * n;
    }

}
