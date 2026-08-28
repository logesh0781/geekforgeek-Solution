/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        if(root==null) return a;
        recursion(root,a,0);
        return a;
    }
    public void recursion (Node root,ArrayList<Integer> a,int l){
        if(root == null) return ;
        if(a.size() == l) a.add(root.data);
        recursion(root.left,a,l+1);
        recursion(root.right,a,l+1);
    }
}