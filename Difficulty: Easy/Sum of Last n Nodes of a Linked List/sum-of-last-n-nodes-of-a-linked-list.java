/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        // code here
        int c=0;
        Node t=head;
        int res=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        c=(c<=n)?0:c-n;
        t=head;
        while(t!=null){
            if(c<=0){
                res+=t.data;
                t=t.next;
                continue;
            }
            c--;
            t=t.next;
        }
        return res;
    }
};