public class MergeTwoSortdLinkedList {
    // recursive
    // time complexity o(n+m);
    // soace complexity o(n+m) recursion stack space;
    Node sortedMerge(Node head1, Node head2) {
        // code here
        return recur(head1,head2);
    }
    Node recur(Node h1,Node h2){
        if(h1==null){
            return h2;
        }
        if(h2==null){
            return h1;
        }
        if(h1.data<h2.data){
            h1.next=recur(h1.next,h2);
            return h1;
        }else {
            h2.next=recur(h1,h2.next);
            return h2;
        }

    }
    // iterative
    // time complexity o(n+m);
    // soace complexity o(1);

    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node ans;
        Node tail;
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        if(head1.data<head2.data){
            ans=head1;
            tail=head1;
            head1=head1.next;
        }else{
            ans=head2;
            tail=head2;
            head2=head2.next;

        }
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                tail.next=head1;
                tail=head1;
                head1=head1.next;
            }else{
                tail.next=head2;
                tail=head2;
                head2=head2.next;
            }
        }
        if(head1==null){
            tail.next=head2;
        }else{
            tail.next=head1;
        }
        return ans;
    }

}
