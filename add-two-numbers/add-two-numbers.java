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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prehead=new ListNode(-1);
        ListNode tail = prehead; int carry=0;
        while(l1!=null && l2!=null){
            int finalVal=l1.val+l2.val+carry;
            if(finalVal>=10){
                finalVal-=10;
                carry=1;
            }else{
                carry=0;
            }
            l1.val=finalVal;
            tail.next=l1;
            tail=tail.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int finalVal=l1.val+carry;
            if(finalVal>=10){
                finalVal-=10;
                carry=1;
            }else{
                carry=0;
            }
            l1.val=finalVal;
            tail.next=l1;
            tail=tail.next;
            l1=l1.next;    
        }
        while(l2!=null){
            int finalVal=l2.val+carry;
            if(finalVal>=10){
                finalVal-=10;
                carry=1;
            }else{
                carry=0;
            }
            l2.val=finalVal;
            tail.next=l2;
            tail=tail.next;
            l2=l2.next;    
        }
        if(carry==1){
            ListNode lastDigit=new ListNode(1);
            tail.next=lastDigit;
            tail=tail.next;
        }
        return prehead.next;
        
        
    }
}