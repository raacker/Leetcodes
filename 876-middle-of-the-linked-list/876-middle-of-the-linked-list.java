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
        ListNode res = head;
        
        int count = 0;
        while (head.next != null) {
            count++;
            head = head.next;
            if (count % 2 == 1) {
                res = res.next;
            }
        }
        
        return res;
    }
}