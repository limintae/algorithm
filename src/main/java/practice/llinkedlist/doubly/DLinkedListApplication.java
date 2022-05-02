package practice.llinkedlist.doubly;

public class DLinkedListApplication {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        // add node
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");
        linkedList.addFirst("d");
        linkedList.addFirst("e");
        linkedList.addFirst("f");

        // remove node
        linkedList.remove(0);
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.print();

        // print
        System.out.println(linkedList.findNode(4).getData());
        System.out.println("complete!");
    }

}
