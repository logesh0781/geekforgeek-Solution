/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node n=new Node(data),t=head;
        if(head.data>data){
            while(t.next!=head) t=t.next;
            n.next=head;
            head=n;
            t.next=head;
            return head;
        }
        t=head;
        while(t.next!=head){
            if(t.next.data>data){
                n.next=t.next;
                t.next=n;
                return head;
            }
            t=t.next;
        }
        t.next=n;
        n.next=head;
        return head;
    }
}