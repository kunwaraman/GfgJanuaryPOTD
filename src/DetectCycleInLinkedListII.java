
// ps:https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1
public class DetectCycleInLinkedListII {
    public static Node findFirstNode(Node head) {
        if(head==null||head.next==null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        Node ptr1 = head;
        Node ptr2 = fast; // ya slow khi se bhi start
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr2;
    }
}
