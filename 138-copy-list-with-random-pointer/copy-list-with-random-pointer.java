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
        if(head==null)return null;
        
        Node temp= head;
        
       while(temp!= null){
        Node dummynode= new Node (temp.val);
        dummynode.next= temp.next;
        temp.next= dummynode;
        temp= dummynode.next;
       }
       connectRandomPointers(head);

       return getDeepCopylist(head);
      
    }
            
 void connectRandomPointers(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy= temp.next;

            if(temp.random!=null){
                copy.random= temp.random.next;
            }else{
                copy.random=null;
            }
            temp=temp.next.next;
        }
    }
        Node getDeepCopylist(Node head){
            Node temp = head;
            Node pseudonode= new Node(-1);
            Node res= pseudonode;

            while(temp!=null){
                res.next=temp.next;
                res=res.next;
                temp.next= temp.next.next;
                temp= temp.next;
            }
            return pseudonode.next;

        }
        
    }