/*
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
    public int getNode(Node head, int k) {
        // code here
        Node temp=head;
        while(temp!=null){
            if(k==1) return temp.data;
            temp=temp.next;
            k--;
        }
        return -1;
    }
}