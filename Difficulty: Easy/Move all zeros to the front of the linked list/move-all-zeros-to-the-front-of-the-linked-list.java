/* Structure of linked list Node
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
class Solution {
    public Node moveZeroes(Node head) {
        // code here.
        Node t=head;
        while(t!=null && t.next!=null){
            if(t.next.data==0){
                Node n=t.next;
                t.next=t.next.next;
                n.next=head;
                head=n;
            }
            else
            t=t.next;
        }
        return head;
    }
}