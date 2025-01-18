// ps:https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
// time complexity O(n)
// space complexity O(1)
public class ReverseLinkedList {
    Node reverseList(Node head) {
        // code here
        Node curr = head;
        Node prev=null;
        Node n = head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=n;
            if(n!=null){
                n=n.next;
            }
        }
        return prev;
    }
}
