// ps: https://www.geeksforgeeks.org/remove-loop-in-linked-list/
// time complexity O(n)
// space complexity O(1)

public class RemoveLoopInLinkedList {
    public static void removeLoop(Node head) {
        if(head==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        Node prev=null;
        Node ptr=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            if(slow==fast){
                while(ptr!=slow){
                    ptr=ptr.next;
                    prev=slow;
                    slow=slow.next;
                }
                prev.next=null;
                return;
            }
        }

    }
}
