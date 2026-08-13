/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        if(head==null || k==1) return null;
        int i=1;
        Node t=head;
        while(t!=null){
            i++;
            if(i%k==0 && t.next!=null){
                t.next=t.next.next;
                i++;
            }
            if(t.next==null) break;
            t=t.next;
        }
        return head;
    }
}