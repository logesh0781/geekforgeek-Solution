/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node odd=new Node(0),o=odd,even=new Node(0),e=even,t=head;
        while(t!=null){
            Node n=new Node(t.data);
            if(t.data%2==0){
                e.next=n;
                e=e.next;
            }
            else{
                o.next=n;
                o=o.next;
            }
            t=t.next;
        }
        e.next=odd.next;
        return even.next;
    }
}