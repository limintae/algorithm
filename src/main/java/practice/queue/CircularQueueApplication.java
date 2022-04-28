package practice.queue;

public class CircularQueueApplication {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        for (int i = 1; i <= 4; i++) {
            int result = circularQueue.add(i);
            System.out.println("add queue : " + result);
        }

        circularQueue.clear();

        for (int i = 1; i <= 5; i++) {
            int result = circularQueue.add(i);
            System.out.println("add queue : " + result);
        }

        for (int i = 1; i <= 5; i++) {
            int result = circularQueue.poll();
            System.out.println("poll queue : " + result);
        }

    }

}
