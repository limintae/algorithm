package practice.stack.array;

public class ArrayStack {

    int[] stack;
    int top;

    ArrayStack(int size) {
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (top >= stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

}
