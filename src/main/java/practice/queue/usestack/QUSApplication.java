package practice.queue.usestack;

public class QUSApplication {

    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        queue.inQueue(1);
        queue.inQueue(2);
        queue.inQueue(3);

        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
    }

}
