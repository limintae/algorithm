package kakao.matching;

import java.util.HashMap;
import java.util.Map;

/**
 * 로또의 최고 순위와 최저 순위
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class P77484 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;

        Map<Integer, Integer> scoreMap = new HashMap<>() {{
            put(6, 1);
            put(5, 2);
            put(4, 3);
            put(3, 4);
            put(2, 5);
            put(1, 6);
            put(0, 6);
        }};

        int matchedCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            int number = lottos[i];
            if (number == 0) {
                zeroCount++;
                continue;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    int winNumber = win_nums[j];
                    if (winNumber == number) {
                        matchedCount++;
                        break;
                    }
                }
            }
        }

        answer[0] = scoreMap.get(matchedCount + zeroCount);
        answer[1] = scoreMap.get(matchedCount);
        return answer;
    }

}