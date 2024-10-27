package singleLinkedList;

public class MainSingleLinkedList {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();


        System.out.println("******추가하기********");
        
        for(int i = 0; i < 5; i++){
            list.addNode(i);
        }

        singleNode current1 = list.head;

        while(current1 != null) {
            System.out.println(current1.value);
            current1 = current1.next;
        }

        System.out.println("******삽입하기********");

        list.insertNode(list.head.next, 999);

        singleNode current2 = list.head;

        while(current2 != null) {
            System.out.println(current2.value);
            current2 = current2.next;
        }

        System.out.println("******삭제하기********");

        list.deleteNode(list.head.next.next.next);

        singleNode current3 = list.head;

        while(current3 != null) {
            System.out.println(current3.value);
            current3 = current3.next;
        }
    }
}
