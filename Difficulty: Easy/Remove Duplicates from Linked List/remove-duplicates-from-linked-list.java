/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        Set<Integer> s=new HashSet();
        s.add(head.data);
        Node temp=head;
        while(temp.next!=null){
            if(s.contains(temp.next.data))
            temp.next=temp.next.next;
            else{
                s.add(temp.next.data);
                temp=temp.next;
            }
        }
        return head;
    }
}