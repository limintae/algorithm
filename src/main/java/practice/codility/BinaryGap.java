package practice.codility;

public class BinaryGap {

    public static void main(String[] args) {
        int result = solution(9);
        System.out.println(result);
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        String[] arrBinary = binary.split("");

        int max = 0;
        int current = 0;
        for (int i = 0; i < arrBinary.length; i++) {
            if (arrBinary[i].equals("0")) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                } else {
                    current = 0;
                }
            }
        }

        return max;
    }

}
