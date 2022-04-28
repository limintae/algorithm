package practice.stack.linked;

public class StackOfLinkedListApplication {

    public static void main(String[] args) {
        StackOfLinkedList stackOfLinkedList = new StackOfLinkedList();

        stackOfLinkedList.push("a");
        stackOfLinkedList.push("b");
        stackOfLinkedList.push("c");

        System.out.println(stackOfLinkedList.pop());
        System.out.println(stackOfLinkedList.pop());
        System.out.println(stackOfLinkedList.pop());
        System.out.println("end!!");
    }

}
