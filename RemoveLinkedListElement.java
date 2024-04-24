/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode save = head;
        ListNode pred = save;
        while (save != null) {
            if (head.val == val) {
                head = head.next;
                save = head;
                pred = save;
            } 
            else if (save.val == val) {
                pred.next = save.next;
                save = save.next;
            }
            else{
                pred = save;
                save = save.next;
            }
        }
        return head;
    }
}