/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Linkedlist_2 {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 1000000) return true;
            head.val = 1000000;
            head = head.next;
        }
        return false;
    }
}