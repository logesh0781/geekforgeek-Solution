/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head.next==null) return head;
        Node z=new Node(0),o=new Node(0),t=new Node(0);
        Node zt=z,ot=o,tt=t;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0) {
                zt.next=temp;
                zt=zt.next;
                temp=temp.next;
                zt.next=null;
            }
            else if(temp.data==1){
                ot.next=temp;
                ot=ot.next;
                temp=temp.next;
                ot.next=null;
            }
            else{
                tt.next=temp;
                tt=tt.next;
                temp=temp.next;
                tt.next=null;
            }
            
        }
        if(ot==o){
            zt.next=t.next;
        }
        else{
        zt.next=o.next;
        ot.next=t.next;}
        return z.next;
    }
}