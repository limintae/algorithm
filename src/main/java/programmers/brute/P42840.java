package programmers.brute;

import java.util.ArrayList;
import java.util.List;

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class P42840 {

    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] pattern1 = new int[] {1, 2, 3, 4, 5};
        int[] pattern2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i ++) {
            if (answers[i] == pattern1[i % pattern1.length]) answer[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) answer[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) answer[2]++;
        }

        int answerSize = 0;
        int max = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                if (max < answer[i]) {
                    max = answer[i];
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        if (max == answer[0]) list.add(1);
        if (max == answer[1]) list.add(2);
        if (max == answer[2]) list.add(3);

        // 결과
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
