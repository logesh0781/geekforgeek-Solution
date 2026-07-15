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
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head,fast=head;
        int c=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
            c++;
            fast=fast.next;
                while(fast!=slow){
                    c++;
                    fast=fast.next;
                }
                return c;
            }
        }
        return 0;
    }
}