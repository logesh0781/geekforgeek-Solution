/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        Node t=head;
        while(t!=null && t.next!=null){
            t.next=t.next.next;
            t=t.next;
        }
    }
}