package datastructure.llinkedlist;

public class LinkedNode {

    private final String data;
    public LinkedNode nextNode;

    public LinkedNode() {
        this.data = null;
        this.nextNode = null;
    }

    public LinkedNode(String data) {
        this.data = data;
        this.nextNode = null;
    }

    public LinkedNode(String data, LinkedNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public String getData() {
        return data;
    }

}
