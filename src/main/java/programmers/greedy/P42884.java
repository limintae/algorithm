package programmers.greedy;

import java.util.Arrays;

/**
 * 단속 카메라
 * https://programmers.co.kr/learn/courses/30/lessons/42884
 */
public class P42884 {

    public int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);
        int cameraPosition = -30000;

        for (int[] route: routes) {
            if (cameraPosition < route[0]) {
                cameraPosition = route[1];
                answer++;
            }
        }

        return answer;
    }

}
