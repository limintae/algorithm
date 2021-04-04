package programmers;

import java.util.Arrays;

public class Runners {

    public static void main(String arg[]) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution s = new Solution();
        String answer = s.solution(participant, completion);
        System.out.println(answer);
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {
            Arrays.sort(participant);
            Arrays.sort(completion);
            int i;
            for (i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    return participant[i];
                }
            }
            return participant[i];
        }
    }
}