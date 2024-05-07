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
        
        ListNode ans=new ListNode((l1.val+l2.val)%10);
        ListNode currentNode=ans;
        int carry=(l1.val+l2.val)/10;
        l1=l1.next;
        l2=l2.next;

        while(l1!=null && l2!=null){

            int rem=(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;
            currentNode.next=new ListNode(rem);
            currentNode=currentNode.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int rem=(l1.val+carry)%10;
            carry=(l1.val+carry)/10;
            currentNode.next=new ListNode(rem);
            currentNode=currentNode.next;
            l1=l1.next;
        }
        while(l2!=null){
            int rem=(l2.val+carry)%10;
            carry=(l2.val+carry)/10;
            currentNode.next=new ListNode(rem);
            currentNode=currentNode.next;
            l2=l2.next;
        }
        if(carry>0){
            currentNode.next=new ListNode(carry);
        }

        return ans;
    }
}