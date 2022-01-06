package programmers.greedy;

import java.util.ArrayList;
import java.util.List;

public class GymSuit {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {2,4},new int[] {1,3,5}));
//        System.out.println(solution(5, new int[] {2,4},new int[] {3}));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> removeLostReserve = new ArrayList<>();
        for (int i = 0; i < reserve.length; i++) {
            boolean isDup = false;
            for(int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                removeLostReserve.add(reserve[i]);
            }
        }

        for (Integer i : removeLostReserve) {
            for (int j = 0; j < lost.length; j++) {
                if (i + 1 == lost[j]) {
                    break;
                }
                if (i - 1 == lost[j]) {
                    break;
                }
                answer += 1;
            }
        }

        return n - answer;
    }

}
