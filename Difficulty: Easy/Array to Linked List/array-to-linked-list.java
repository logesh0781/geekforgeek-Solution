/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node head=new Node(0);
        Node tail=head;
        for(int i:arr){
            Node a=new Node(i);
            tail.next=a;
            tail=a;
        }
        return head.next;
    }
}
