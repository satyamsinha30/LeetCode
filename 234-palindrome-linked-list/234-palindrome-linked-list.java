/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals=new ArrayList<>();
        ListNode currentNode=head;
        while(currentNode !=null){
            vals.add(currentNode.val);
            currentNode=currentNode.next;
        }
        int start=0,end=vals.size()-1;
        while(start<end){
            if(!(vals.get(start)==(vals.get(end))))
                return false;
            start++;end--;
        }
        return true;
    }
}