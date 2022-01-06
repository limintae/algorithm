package programmers.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public static void main(String arg[]) {

        solution(2, 10, new int[]{7, 4, 5, 6});

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> waitTrucks = new LinkedList<>();
        Queue<Integer> moveTrucks = new LinkedList<>();
        Queue<Integer> arvTrucks = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            waitTrucks.add(truck_weights[i]);
        }

        int curWeight = 0;
        while (true) {
            answer++;

            if (arvTrucks.peek() != null && answer == arvTrucks.peek()) {
                // 트럭이 다리를 건넛을 경우
                curWeight -= moveTrucks.peek();
                moveTrucks.remove();
                arvTrucks.remove();
            }

            if (waitTrucks.peek() != null && curWeight + waitTrucks.peek() <= weight) {
                int curTruck = waitTrucks.poll();
                moveTrucks.add(curTruck);
                curWeight += curTruck;
                arvTrucks.add(answer + bridge_length);
            }

            if (waitTrucks.size() == 0 && arvTrucks.size() == 0) {
                break;
            }
        }

        return answer;
    }

}
