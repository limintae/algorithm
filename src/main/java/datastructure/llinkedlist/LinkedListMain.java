package datastructure.llinkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("a");
        linkedList.insertNode("b");
        linkedList.insertNode("c");
        linkedList.insertNode("d");
        linkedList.insertNode("e");
        linkedList.insertAfter(linkedList.findFirst("a"), "aa");
        linkedList.insertAfter(linkedList.findFirst("b"), "bb");
        linkedList.deleteNext(linkedList.findFirst("a"));
        linkedList.print();
    }

}
