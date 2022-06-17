/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> seen=new HashSet<>();
        // while(head!=null){
        //     if(seen.contains(head)){
        //         return true;
        //     }
        //     seen.add(head);
        //     head=head.next;
        // }
        // return false;
        if(head==null)
            return false;
        ListNode slowPointer=head;
        ListNode fastPointer=head.next;
        while(slowPointer!=fastPointer){
            if(fastPointer==null || fastPointer.next== null){
                return false;
            }
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        return true;
        
    }
}