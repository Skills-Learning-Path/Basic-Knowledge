/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null) return head;
        else{
            ListNode newhead = reverse(head.next);
            ListNode p = newhead;
            while(p.next!=null){
                p=p.next;
            }
            ListNode q = new ListNode(head.val);
            p.next=q;
            q.next=null;
            return newhead;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode newhead=reverse(head);
        ListNode p = head;
        ListNode q = newhead;
        while(p!=null&&q!=null){
            if(p.val!=q.val) return false;
            p=p.next;
            q=q.next;
        }
        return true;
    }
}
