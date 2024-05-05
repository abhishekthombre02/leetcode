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
    public ListNode removeElements(ListNode head, int val) {
        
         while (head != null && head.val == val) {
            head = head.next; 
        }
        
        ListNode ptr=head;
        while(ptr!=null && ptr.next!=null){
            System.out.println(ptr.val);
            if(ptr.next.val==val){
                ptr.next=ptr.next.next;
            }
            else{
                ptr=ptr.next;
            }     
        }
        System.gc();
    
      return head;
    }
}