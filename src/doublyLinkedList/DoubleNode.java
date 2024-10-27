package doublyLinkedList;

public class DoubleNode {
    int value;

    //객체 Node를 타입으로 지정하였기 때문에 next, prev는 주소값을 가진 객체로 분류된다.
    DoubleNode next;

    DoubleNode prev;

    public DoubleNode() {}

    //생성자로 Node객체. 즉, Node 타입으로 받은 head, next 에게 value 넣기
    public DoubleNode(int value) {
        this.value = value;
    }
}
