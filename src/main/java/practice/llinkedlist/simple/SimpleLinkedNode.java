package practice.llinkedlist.simple;

public class SimpleLinkedNode {

    private final String data;
    public SimpleLinkedNode nextNode;

    public SimpleLinkedNode() {
        this.data = null;
        this.nextNode = null;
    }

    public SimpleLinkedNode(String data) {
        this.data = data;
        this.nextNode = null;
    }

    public SimpleLinkedNode(String data, SimpleLinkedNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public String getData() {
        return data;
    }

}
