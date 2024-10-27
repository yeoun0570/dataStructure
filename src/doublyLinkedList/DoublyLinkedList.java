package doublyLinkedList;

public class DoublyLinkedList {
    //head, tail 값은 하나만 존재하면 되니까 이곳에서 선언
    //참조형 변수이기 때문에 객체를 직접 생성하는게 아니라 이미 존재하는 노드 객체를 가르킬 수 있도록 참조하는 변수이다.
    public DoubleNode head;
    public DoubleNode tail;

    public void addNode(int value) {
        //newNode라는 주소값을 가지고, value를 적용한 객체 생성
        DoubleNode newNode = new DoubleNode(value);

        if (this.head == null) {
            //head(첫번째 노드)가 null이면 거기에 newNode 주소값을 넣어줌
            this.head = newNode;
            //아직 하나의 값밖에 없기 때문에 head와 tail이 같은 주소값을 가르킬 수 있도록 설정
            this.tail = this.head;
        } else {
            //head가 존재하면 head를 가르키는 참조형 변수 node 선언
            DoubleNode node = this.head;

            //head 다음 값이 존재하면 while문 돌림
            //값이 존재하면 node를 계속 노드의 다음값으로 변환시킴
            //다음 값이 null이 될때까지 계속 돌려서 찾음
            while (node.next != null) {
                //node 에 node.next 로 선언
                node = node.next;
            }

            //node.next가 null이면 value를 적용시킨 newNode를 가르킴
            node.next = newNode;
            //newNode.prev는 참조형 변수 node를 가르킴
            newNode.prev = node;
            //마지막 값이 적용된 newNode를 tail이 가르키도록 설정
            this.tail = newNode;
        }
    }

    public void insertNode(DoubleNode findNode, int value) {
        //삽입할 노드의 다음 노드를 nextNode 라는 곳에 저장
        DoubleNode nextNode = findNode.next;

        //조회한 노드 다음 노드에 새로운 값 적어주고 그곳을 node라는 곳으로 받음
        findNode.next = new DoubleNode(value);
        DoubleNode node = findNode.next;

        //받은 node의 next값에 이전에 저장해둔 nextNode를 넣어줌
        node.next = nextNode;
        node.prev = findNode;
        nextNode.prev = node;
    }

    public void deleteNode(DoubleNode removeNode) {
        //삭제할 노드의 next와 prev값 찾아놓기
        DoubleNode prevNode = removeNode.prev;
        DoubleNode nextNode = removeNode.next;

        //노드 삭제하기
        removeNode = null;

        //삭제한 노드의 이전/이후 노드끼리 연결
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}
