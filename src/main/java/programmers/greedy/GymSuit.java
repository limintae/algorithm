package programmers.greedy;

import java.util.*;

public class GymSuit {

//    public static void main(String[] args) {
//        System.out.println(solution(5, new int[] {2,4},new int[] {1,3,5}));
////        System.out.println(solution(5, new int[] {2,4},new int[] {3}));
//    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = 0;
        int lostCount = lost.length;
        int lostAndReverseCount = 0;

        // 체육복을 빌려줄 수 있는 학생 List
        List<Integer> removeLostReserve = new ArrayList<>();

        for (int i = 0; i < reserve.length; i++) {
            boolean isDup = false;
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    isDup = true;
                    lost[j] = -1;
                    break;
                }
            }
            if (!isDup) {
                removeLostReserve.add(reserve[i]);
            } else {
                lostAndReverseCount += 1;
            }
        }

        Set<Integer> getterSuitLostStudents = new HashSet<>();
        List<Integer> lostStudents = new ArrayList<>();
        for (Integer i : removeLostReserve) {
            for (int j = 0; j < lost.length; j++) {
                int lostStudentNumber = lost[j];
                if (getterSuitLostStudents.contains(lostStudentNumber) || lostStudentNumber == -1) {
                    continue;
                }
                if (i + 1 == lostStudentNumber || i - 1 == lostStudentNumber) {
                    getterSuitLostStudents.add(lostStudentNumber);
                    lostCount = lostCount - 1;
                    break;
                }
                lostStudents.add(lostStudentNumber);
            }
        }

        answer = n - lostCount + lostAndReverseCount;
        return answer;
    }

}
