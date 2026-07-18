/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node t1=head1,t2=head2;
        Node dummy=new Node(0);
        Node head=dummy;
        while(t1!=null && t2!=null){
            if(t1.data>t2.data){
                dummy.next=t2;
                t2=t2.next;
            }
            else{
                dummy.next=t1;
                t1=t1.next;
            }
            dummy=dummy.next;
        }
        dummy.next=(t1==null)? t2 :t1;
        return head.next;
    }
}