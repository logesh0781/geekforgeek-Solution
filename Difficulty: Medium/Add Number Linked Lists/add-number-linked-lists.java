/*
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
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node forw=null;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1=reverse(head1);
        head2=reverse(head2);
        Node dummy=new Node(0);
        Node curr=dummy;
        int carry=0;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        Node res = reverse(dummy.next);
        while(res!=null && res.data==0 && res.next!=null)
        res=res.next;
        return res;
    }
}