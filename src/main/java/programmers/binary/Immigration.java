package programmers.binary;

import java.util.ArrayList;
import java.util.Collections;

public class Immigration {

    public static void main(String[] arg) {
        solution(6, new int[] {7,10});
    }

    public static long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        long end = 0;
        long max = 0;

        for (int i = 0; i < times.length; i++) {
            if (times[i] > max) {
                max = times[i];
            }
        }

        max *= n;
        end = max;
        answer = max;

        while (start < end) {

            long t = 0;
            long mid = (long) Math.floor((start + end) / 2);

            for (int i = 0; i < times.length; i++) {
                t += Math.floor(mid / times[i]);
            }

            if (t < n) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        answer = end;
        return answer;
    }

}
