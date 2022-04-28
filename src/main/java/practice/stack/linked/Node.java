package practice.stack.linked;

public class Node {

    private final String data;
    private Node nextNode;

    Node(String data) {
        this.data = data;
        this.nextNode = null;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public String getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

}
