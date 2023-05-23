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
        if(head == null || head.next == null) {
            return head;
        }
        ListNode nextNode = head.next;
        head.next = null;
        ListNode buffer = nextNode.next;
        while(nextNode != null) {
            buffer = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = buffer;
        }
        return head;
    }
}