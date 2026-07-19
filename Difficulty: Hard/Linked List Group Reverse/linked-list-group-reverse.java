/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        int i=1;
        Node r=new Node(0);
        Node h=r;
        Node tail=null,c=null,temp=head;
        while(temp!=null){
            if(i==1){
                r.next=temp;
                temp=temp.next;
                r.next.next=null;
                c=r.next;
                tail=c;
                i++;
            }
            else if(i<=k){
                r.next=temp;
                temp=temp.next;
                r.next.next=c;
                c=r.next;
                i++;
            }
            else {
                i=1;
                r=tail;
            }
        }
        return h.next;
    }
}