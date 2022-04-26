package practice.llinkedlist.simple;

public class SimpleLinkedListMain {

    public static void main(String[] args) {
        SimpleLinkedList linkedList = new SimpleLinkedList();
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
