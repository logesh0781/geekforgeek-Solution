/*Structure of a link list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        // code here
        HashSet<Integer> s=new HashSet<>();
        while(head2!=null){
            s.add(head2.data);
            head2=head2.next;
        }
        int c=0;
        while(head1!=null){
            if(s.contains(x-head1.data)) c++;
            head1=head1.next;
        }
        return c;
    }
}