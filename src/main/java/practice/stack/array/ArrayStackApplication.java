package practice.stack.array;

public class ArrayStackApplication {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        for (int i = 0; i < 6; i++) {
            System.out.println(arrayStack.pop());
        }
    }

}
