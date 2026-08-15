/* Node Structure
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} 
*/
class Solution {
    int multiplyTwoLists(Node first, Node second) {
        // Code here
        String s1="",s2="";
        int mod=1000000007;
        while(first!=null){
            s1=s1+first.data;
            first=first.next;
        }
        while(second!=null){
            s2=s2+second.data;
            second=second.next;
        }
        long a=Long.parseLong(s1),b=Long.parseLong(s2);
        return (int)(a*b%mod);
    }
}
