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
        ListNode mergedAndSortedListHead = new ListNode(-101);
        ListNode cursor = mergedAndSortedListHead;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                cursor.next = list1;
                cursor = cursor.next;
                list1 = list1.next;
            } else {
                cursor.next = list2;
                cursor = cursor.next;
                list2 = list2.next;
            }
        }
        cursor.next = list1 == null ? list2 : list1;
        return mergedAndSortedListHead.next;
    }
}