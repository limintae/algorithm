package practice.codility;

/**
 * https://app.codility.com/
 */
public class FrogJump {

    public static void main(String[] args) {
        int answer = solution(10, 90, 30);
        System.out.println(answer);
    }

    private static int solution(int X, int Y, int D) {
        int distance = Y - X;
        if (distance <= 0) return 0;

        double jump =  distance / (double) D;
        return (int) Math.ceil(jump);
    }

}
