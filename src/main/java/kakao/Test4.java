package kakao;

public class Test4 {

    public static void main(String[] arg) {
        solution(new long[]{1, 2, 3, 4, 5, 2, 1, 3, 4});
    }

    public static long solution(long[] arr) {
        long answer = 0;
        long findLen = 0;
        long prevLen = 0;
        long prevVal = 0;
        /**
         * 0 : increment
         * 1 : increment and decrement
         * 2 : decrement and increment
         */
        long stata = 0;
        final long MAX_LEN = arr.length;

        for (int i = 0; i < MAX_LEN - 1; i++) {

            if (i > 0) {

            } else {
                // start
                prevVal = arr[i];
            }
        }

        return answer;
    }

}
