package programmers.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42586 {

    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> remains = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainDate = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);

            if (!remains.isEmpty() && remains.peek() < remainDate) {
                answerList.add(remains.size());
                remains.clear();
            }

            remains.offer(remainDate);

            if (i == speeds.length - 1) {
                // last index
                answerList.add(remains.size());
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

}
