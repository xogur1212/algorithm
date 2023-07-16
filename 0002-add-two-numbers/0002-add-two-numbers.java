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
        
    ListNode answerNode = new ListNode(0);
    ListNode headNode = answerNode;
        
    int carry = 0;
    while( l1 != null || l2 != null) {
        int l1Value = (l1 != null) ? l1.val : 0;
        int l2Value = (l2 != null) ? l2.val : 0;
        
        int currentSum = l1Value + l2Value + carry;
        carry = currentSum / 10 ; 
        int lastDigit = currentSum % 10;
        
        ListNode newNode = new ListNode(lastDigit);
        headNode.next = newNode;
        
        if(l1 != null) 
            l1 = l1.next;
        if(l2 != null) 
            l2 = l2.next;
        
        headNode = headNode.next;
    }
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            headNode.next = newNode;
            headNode = headNode.next;
        }
        return answerNode.next;
    }
}
    