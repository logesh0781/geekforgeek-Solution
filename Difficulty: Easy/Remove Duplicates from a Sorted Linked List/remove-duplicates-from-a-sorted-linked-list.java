/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
if(head==null) return head;
        Node temp=head,f=head.next;
        while(f!=null){
            if(temp.data==f.data){
                if(f.next==null){
                    temp.next=null;
                    return head;
                }
                f=f.next;
                temp.next=f;
                continue;
            }
            temp=f;
            f=f.next;        
        }
        return head;
    }
}