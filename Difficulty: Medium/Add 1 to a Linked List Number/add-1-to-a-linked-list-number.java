/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;  
            curr.next = prev;   
            prev = curr;    
            curr = next;        
        }

        return prev; 
    }
    public Node addOne(Node head) {
        // code here.
        boolean flag=true;
        Node rev=reverse(head),r=rev,prev=null;
        while(r!=null){
            if(r.data<9){
                r.data+=1;
                flag=false;
                break;
            }
            r.data=0;
            prev=r;
            r=r.next;
        }
        if(flag){
            Node n=new Node(1);
            prev.next=n;
        }
        head=reverse(rev);
        return head;
    }
}