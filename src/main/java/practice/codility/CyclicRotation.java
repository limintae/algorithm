package practice.codility;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] answer = solution(new int[] {3, 8, 9, 7, 6}, 3);
    }

    private static int[] solution(int[] A, int K) {
        // 예를 들어 A = [3, 8, 9, 7, 6] 이며 K는 3일 경우
        // 3번의 오른쪽 shift 가 발생하여 A = [9, 7, 6, 3, 8]가 된다
        int[] shiftedArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int shiftedIndex = (i + K) % A.length;
            shiftedArray[shiftedIndex] = A[i];
        }
        return shiftedArray;
    }

}
