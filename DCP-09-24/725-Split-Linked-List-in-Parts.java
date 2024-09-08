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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int count = 0;
        ListNode curr = head;
        while(curr != null) {
            count ++;
            curr = curr.next;
        }



        ListNode tempHead = head;
        int remainder = count % k;
        int l = count / k;
        int i = 0;
        while(count > 0) {
            // System.out.println(\here\);
            int length = l;
            if(remainder > 0) {
                length++;
                remainder --;
            }

            curr = tempHead;
            // System.out.println(\l \ + length);
            // System.out.println(\node \ + curr.val);
            ListNode prev = null;
            while(length > 0 && curr != null) {
                length --;
                count --;
                prev = curr;
                curr = curr.next;
            }
            System.out.println(count);
            // System.out.println(\node after: \ + curr.val);
            result[i++] = tempHead;
            if(curr != null) {
                tempHead = curr;
                prev.next = null;
            }
        }

        
        return result;
    }
}