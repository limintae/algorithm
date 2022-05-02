package practice.queue.usestack;

import java.util.Stack;

public class QueueUsingStack<E> {

    private final Stack<E> inQueue;
    private final Stack<E> outQueue;

    public QueueUsingStack() {
        this.inQueue = new Stack<>();
        this.outQueue = new Stack<>();
    }

    public void inQueue(E v) {
        inQueue.add(v);
    }

    public E outQueue() {
        if (outQueue.isEmpty()) {
            while (!inQueue.isEmpty()) {
                outQueue.add(inQueue.pop());
            }
        }
        return outQueue.pop();
    }

}
