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
    public ListNode reverseList(ListNode head) {
        //take prev node 
        ListNode prev_node=null;
        //take current node
        ListNode current_node=head;

        //reverse linked list by swaping the node
        while(current_node!=null){
            ListNode next_node=current_node.next;
            next_node=current_node.next;
            current_node.next=prev_node;
            prev_node=current_node;
            current_node=next_node;
        }
        return prev_node;
    }
}