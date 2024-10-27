package doublyLinkedList;
public class MainDoublyLinkedList {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("******추가하기********");

        for(int i = 0; i < 5; i++){
            list.addNode(i);
        }

        DoubleNode current1 = list.head;

        while(current1 != null) {
            System.out.println(current1.value);
            current1 = current1.next;
        }

        current1 = list.tail;

        while(current1 != null) {
            System.out.println("prev: " + current1.value);
            current1 = current1.prev;
        }

        System.out.println("******삽입하기********");

        list.insertNode(list.head.next, 999);

        DoubleNode current2 = list.head;

        while(current2 != null) {
            System.out.println(current2.value);
            current2 = current2.next;
        }

        current2 = list.tail;

        while(current2 != null) {
            System.out.println("prev: " + current2.value);
            current2 = current2.prev;
        }

        System.out.println("******삭제하기********");

        list.deleteNode(list.head.next.next.next);

        DoubleNode current3 = list.head;

        while(current3 != null) {
            System.out.println(current3.value);
            current3 = current3.next;
        }

        current3 = list.tail;

        while(current3 != null) {
            System.out.println("prev: " + current3.value);
            current3 = current3.prev;
        }
    }
}
