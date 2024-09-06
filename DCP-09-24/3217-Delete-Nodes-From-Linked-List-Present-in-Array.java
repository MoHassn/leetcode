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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode prev = new ListNode(0, head);
        HashSet<Integer> toBeDeleted = new HashSet<>();
        for(int i = 0; i < nums.length; i ++) {
            toBeDeleted.add(nums[i]);
        }

        ListNode curr = prev.next;
        ListNode prevT = prev;
        while(curr != null) {
            if(toBeDeleted.contains(curr.val)) {
                prevT.next = curr.next;
                curr = curr.next;
            } else {
                prevT = curr;
                curr = curr.next;
            }
        }


        return prev.next;
    }
}