package datastructure.llinkedlist;

public class LinkedList {

    private LinkedNode head;

    public LinkedList() {
        this.head = null;
    }

    /**
     * 마지막 Node Insert
     * @param data
     */
    public void insertNode(String data) {
        LinkedNode newNode = new LinkedNode(data);

        if (head == null) {
            this.head = newNode;
        } else {
            LinkedNode headNode = head;

            while (headNode.nextNode != null) {
                headNode = headNode.nextNode;
            }

            headNode.nextNode = newNode;
        }

    }

    /**
     * 중간 Node Insert
     * @param preNode
     * @param data
     */
    public void insertAfter(LinkedNode preNode, String data) {
        LinkedNode newNode = new LinkedNode(data);
        newNode.nextNode = preNode.nextNode;
        preNode.nextNode = newNode;
    }

    /**
     * 다음노드를 삭제한다.
     * @param preNode
     */
    public void deleteNext(LinkedNode preNode) {
        if (preNode.nextNode != null) {
            // 다음 노드가 꼬리 노드(null)일 경우 아무것도 하지않는다.
            preNode.nextNode = preNode.nextNode.nextNode;
        }
    }

    /**
     * 특정 키를 가진 노드 탐색
     * @param target
     * @return
     */
    public LinkedNode findFirst(String target) {
        LinkedNode headNode = head;
        LinkedNode targetNode = null;

        while (headNode != null) {
            if (headNode.getData().equals(target)) {
                targetNode = headNode;
                break;
            }
            headNode = headNode.nextNode;
        }

        if (targetNode == null) {
            throw new RuntimeException("targetNode not found");
        } else {
            return targetNode;
        }
    }

    /**
     * 노드 출력
     */
    public void print() {
        LinkedNode headNode = head;

        while (headNode != null) {
            System.out.println(headNode.getData());
            headNode = headNode.nextNode;
        }
    }

}