package practice.queue;

public class CircularQueue {

    int front;
    int rear;
    int[] queue;

    public CircularQueue(int size) {
        this.front = 0;
        this.rear = 0;
        this.queue = new int[size + 1]; // 완충지대를 고려한 원형 크기설정
    }

    int add(int k) {
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue overflow.");
            return -1;
        }
        queue[rear] = k;
        rear = ++rear % queue.length;
        return k;
    }

    int poll() {
        int i;
        if (front == rear) {
            // 큐가 비어있는가?
            System.out.println("Queue underflow");
            return -1;
        }

        i = queue[front];
        front = ++front % queue.length;
        return i;
    }

    void clear() {
        System.out.println("Clear Queue");
        front = rear;
    }

}
