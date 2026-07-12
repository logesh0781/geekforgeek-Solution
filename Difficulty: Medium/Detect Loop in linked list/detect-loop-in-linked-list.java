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
    public boolean detectLoop(Node head) {
        
        // Floyd's Cycle Detection 
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//move pointer one node
            fast=fast.next.next;// move pointer two nodes
            
            if(slow==fast)//both pointer meet at one node
                return true ; //it is looped list
        }
        return false;
    }
}
