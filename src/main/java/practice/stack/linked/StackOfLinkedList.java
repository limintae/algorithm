package practice.stack.linked;

public class StackOfLinkedList {

    private Node head;

    public StackOfLinkedList() {
        this.head = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node oldNode = head;
            newNode.setNextNode(oldNode);
            head = newNode;
        }
    }

    public String pop() {
        // 현재 head node를 head의 다음 노드로 변경하고 현재 head의 값을 리턴한다.
        if (head == null) {
            throw new NullPointerException("Stack is empty");
        }

        Node oldHeadNode = head;
        head = head.getNextNode();
        return oldHeadNode.getData();
    }

}
