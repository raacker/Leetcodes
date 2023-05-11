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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        else if (list2 == null)
            return list1;
        else if (list1 == null)
            return list2;
        
        ListNode head = new ListNode();
        ListNode returnNode = head;
        ListNode list1Pointer = list1;
        ListNode list2Pointer = list2;

        while (list1Pointer != null && list2Pointer != null) {
            if (list1Pointer.val <= list2Pointer.val) {
                head.next = list1Pointer;
                head = head.next;
                list1Pointer = list1Pointer.next;
            } else {
                head.next = list2Pointer;
                head = head.next;
                list2Pointer = list2Pointer.next;
            }
        }

        if (list2Pointer != null) {
            head.next = list2Pointer;
        }
        else if (list1Pointer != null) {
            head.next = list1Pointer;
        }

        return returnNode.next;
    }
}