/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || k==0) return head;
        Node temp=head,r=null;
        int c=0,i=1;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        k=k%c;
        if(k==0) return head;
        c=k;
        temp=head;

        while(i<c){
            temp=temp.next;
            i++;
        }
        r=temp.next;
        
        temp.next=null;
        temp=head;
        head=r;
        while(r.next!=null) r=r.next;

        r.next=temp;
        return head;
    }
}