/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited=new HashSet<>();
        ListNode curr=headA;
        while(curr!=null){
            visited.add(curr);
            curr=curr.next;
        }
        ListNode currB=headB;
        while(currB!=null){
            if(visited.contains(currB)){
                return currB;
            }
            currB=currB.next;
        }
        return null;
    }
}