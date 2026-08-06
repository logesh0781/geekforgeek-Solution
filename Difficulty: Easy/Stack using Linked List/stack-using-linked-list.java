/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    Node head=null;
    int top;

    public myStack() {
        // Initialize your data members
        top=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top==0) return true;
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node n=new Node(x);
        n.next=head;
        head=n;
        top++;
        
    }

    public void pop() {
        // Removes the front element of the stack.
        head=head.next;
        top--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(top==0) return -1;
        return head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return top;
    }
}
