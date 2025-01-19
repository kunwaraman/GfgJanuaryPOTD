

public class RotateLinkedList {
    public Node rotate(Node head, int k) {
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }

        while(k-->0){
            Node temp=head;
            head=head.next;
            temp.next=null;
            tail.next=temp;
            tail=temp;

        }
        return head;
    }
}
