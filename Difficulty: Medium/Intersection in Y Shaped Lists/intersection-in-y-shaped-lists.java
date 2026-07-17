/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node t1=head1,t2=head2;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==null) t1=head2;
            if(t2==null) t2=head1;
        }
        return t1;
    }
}