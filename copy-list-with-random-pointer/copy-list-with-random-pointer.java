/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node ptr=head;
        //create clone nodes next to original nodes
        while(ptr!=null){
            Node newNode= new Node(ptr.val);
            newNode.next=ptr.next;
            ptr.next=newNode;
            ptr=newNode.next;
        }
        ptr=head;
        //link random pointers
        while(ptr!=null){
            ptr.next.random=(ptr.random!=null)? ptr.random.next:null;
            ptr=ptr.next.next;
        }
        Node old_ptr=head;
        Node new_ptr=head.next;
        Node new_head=head.next;
        
        while(old_ptr!=null){
            old_ptr.next=old_ptr.next.next;
            new_ptr.next=(new_ptr.next!=null)?new_ptr.next.next:null;
            old_ptr=old_ptr.next;
            new_ptr=new_ptr.next;
        }
        return new_head;
        
        
        
    }
}