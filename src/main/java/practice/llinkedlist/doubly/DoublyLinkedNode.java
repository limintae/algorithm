package practice.llinkedlist.doubly;

public class DoublyLinkedNode {

    private String data;
    private DoublyLinkedNode next;
    private DoublyLinkedNode prev;

    public DoublyLinkedNode(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public void setPrev(DoublyLinkedNode prev) {
        this.prev = prev;
    }

    public String getData() {
        return data;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public DoublyLinkedNode getPrev() {
        return prev;
    }

}
