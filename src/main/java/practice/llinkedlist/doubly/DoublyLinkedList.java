package practice.llinkedlist.doubly;

import practice.llinkedlist.simple.SimpleLinkedNode;

public class DoublyLinkedList {

    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(String data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNext(head);

        if (head != null) {
            head.setPrev(newNode);
        }

        head = newNode;
        size++;
        if (head.getNext() == null) {
            tail = head;
        }
    }

    public void addLast(String data) {
        if (size == 0) {
            addFirst(data);
        } else {
            DoublyLinkedNode newNode = new DoublyLinkedNode(data);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            size++;
        }
    }

    public DoublyLinkedNode findNode(int index) {
        DoublyLinkedNode x;
        if (index < size / 2) {
            // head 에서부터 탐색
            x = this.head;
            for (int i = 0; i < index; i++) {
                x = x.getNext();
            }
        } else {
            // tail 에서부터 탐색
            x = this.tail;
            for (int i = size - 1; i > index; i--) {
                x = x.getPrev();
            }
        }
        return x;
    }

    public void add(int k, String data) {
        if (k == 0) {
            addFirst(data);
        } else {
            DoublyLinkedNode newNode = new DoublyLinkedNode(data);
            DoublyLinkedNode temp1 = findNode(k - 1);
            DoublyLinkedNode temp2 = temp1.getNext();

            temp1.setNext(newNode);
            newNode.setNext(temp2);
            if (temp2 != null) {
                temp2.setPrev(newNode);
            }
            newNode.setPrev(temp1);
            size++;
            if (newNode.getNext() == null) {
                tail = newNode;
            }
        }
    }

    public String removeFirst() {
        // 1. 기존 head 를 temp 변수에 할당
        DoublyLinkedNode temp = head;

        // 2. head 의 next 노드 를 head 로 할당
        head = head.getNext();

        // 3. 삭제된 노드가 가지고있던 데이터 리턴
        String removedData = temp.getData();

        // 4. 삭제되는 노드의 메모리 해제를 위한 null 할당
        temp = null;

        // 5. 신규 head 가 null 이 아니라면
        // (기존 head 의 next) 노드의 이전 노드에 null 할당
        if (head != null) {
            head.setPrev(null);
        }

        // 6. List 크기 감소
        size--;

        // 7. 삭제된 데이터 반환
        return removedData;
    }

    public String remove(int k) {
        if (k == 0) {
            return removeFirst();
        }

        DoublyLinkedNode temp = findNode(k - 1);
        DoublyLinkedNode todoDeleted = temp.getNext();
        temp.setNext(temp.getNext().getNext());
        temp.getNext().setPrev(temp);

        String removedData = todoDeleted.getData();
        if (todoDeleted == tail) {
            tail = temp;
        }

        todoDeleted = null;
        size--;
        return removedData;
    }

    public String removeLast() {
        return remove(size - 1);
    }

    public void print() {
        DoublyLinkedNode headNode = head;

        while (headNode != null) {
            System.out.println(headNode.getData());
            headNode = headNode.getNext();
        }
    }

}
