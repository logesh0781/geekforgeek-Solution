/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x == 1) return head.next;
        
       Node temp = head;
       for(int i=1; i<x-1; i++){
           temp = temp.next;
       }
       temp.next = temp.next.next;
       
       return head;
    }
}