/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head.next==null){
            head=null;
            return head;
        }
        int c=0;
        Node t=head;
        while(t!=null){
            t=t.next;
            c++;
        }
        c=c/2;
        t=head;
        while(c>1){
            t=t.next;
            c--;
        }
        t.next=t.next.next;
        return head;
    }
}