/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        int c=0,i=1,s;
        Node temp=head,firstL=head,secondL=null;
        
        //find length of the list
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        
        //reserve second half of the list
        if(c%2==0)
        s=(c/2)+1;
        else
        s=(c/2)+2;
        temp=head;
        while(temp!=null){
            if(s<=i){
            Node newNode=new Node(temp.data);
            if(secondL==null){
            secondL=newNode;}
            else{
                newNode.next=secondL;
                secondL=newNode;
            }}
            temp=temp.next;
            i++;
        }
        
        //compare
        
        while(secondL!=null){
            if(firstL.data!=secondL.data)
            return false;
            firstL=firstL.next;
            secondL=secondL.next;
        }
        return true ;
    }
}