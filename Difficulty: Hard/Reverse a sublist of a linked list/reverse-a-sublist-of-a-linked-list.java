/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    void reverse(Node head){
        Node next=null;
        Node prev=null,cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
    }
    Node reverseBetween(int a, int b, Node head) {
        // code here
        Node dummy=new Node(0),t=dummy;
        dummy.next=head;
        for(int i=1;i<a;i++){
            t=t.next;
        }
        Node ftail=t,rhead=t.next;
        t=t.next;
        ftail.next=null;
        for(int i=1;i<=b-a;i++){
            t=t.next;
        }
        Node rtail=t,shead=t.next;
        rtail.next=null;
        reverse(rhead);
        ftail.next=rtail;
        rhead.next=shead;
        return dummy.next;
    }
}