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
    public ListNode middleNode(ListNode head) {
            
        ListNode result= null;
        ListNode tmp =head;
            int count =0;
            while(tmp!=null){
                count++;
                tmp=tmp.next;
            }
            
            
            System.out.println(count/2);
        
        for(int i=0;i<count/2;i++){
            head=head.next;
        }
        result=head;
            
        return result;
        
    }
}