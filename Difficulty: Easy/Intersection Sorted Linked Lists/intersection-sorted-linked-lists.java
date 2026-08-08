/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node t1=head1,t2=head2;
        Node dummy=new Node(0);
        Node t=dummy;
        while(t1!=null && t2!=null){
            if(t1.data==t2.data){
                t.next=new Node(t1.data);
                t=t.next;
                t1=t1.next;
                t2=t2.next;
            }
            else if(t1.data<t2.data) t1=t1.next;
            else t2=t2.next;
        }
        return dummy.next;
    }
}