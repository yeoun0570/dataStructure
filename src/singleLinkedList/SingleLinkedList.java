package singleLinkedList;

public class SingleLinkedList {
    
    //head값은 하나만 존재하면 되니까 이곳에서 선언
    public Node head;

    public void addNode(int value) {
        if(this.head == null) {
            //head(첫번째 노드)가 null이면 거기에 value를 넣어줌
            this.head = new Node(value);
        } else {
            //head가 존재하면 node를 head로 선언
            Node node = this.head;

            //head 다음 값이 존재하면 while문 돌림
            //값이 존재하면 node를 계속 노드의 다음값으로 변환시킴
            //다음 값이 null이 될때까지 계속 돌려서 찾음
            while (node.next != null) {
                node = node.next;
            }

            //while문으로 null 값인 다음 노드에 매개변수로 받은 value를 넣어줌
            node.next = new Node(value);
        }
    }

    public void insertNode(Node findNode, int value) {
        //삽입할 노드의 next노드를 nextNode 라는 곳에 저장
        Node nextNode = findNode.next;

        //조회한 노드 다음 노드에 새로운 값 적어주고 그곳을 node라는 곳으로 받음
        findNode.next = new Node(value);
        Node node = findNode.next;

        //받은 node의 next값에 이전에 저장해둔 nextNode를 넣어줌
        node.next = nextNode;
    }

    public void deleteNode(Node prevNode) {
        //삭제할 다음 노드 찾기
        Node nextNode = prevNode.next.next;

        //노드 삭제
        prevNode.next = null;

        //이전 노드의 다음 노드를 삭제할 노드의 다음 노드인 것을 지정
        prevNode.next = nextNode;
    }
}
