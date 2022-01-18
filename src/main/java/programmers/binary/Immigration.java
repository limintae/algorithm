package programmers.binary;

public class Immigration {

    public long solution(int n, int[] times) {
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
