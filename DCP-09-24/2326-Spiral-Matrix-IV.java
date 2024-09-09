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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int c = m * n;
        int[][] result = new int[m][n];

        int uRow = 0;
        int lRow = m;
        int lColumn = 0;
        int rColumn = n;
        while(c > 0) {
            //first row;
            for(int i=lColumn; i < rColumn; i++) {
                if(head != null) {
                    result[uRow][i] = head.val;
                    head = head.next;
                }else {
                    result[uRow][i] = -1;
                }
                c--;
            }
            uRow ++;
            if(c == 0) break;

            for(int i = uRow; i < lRow; i++) {

                if(head != null) {
                    result[i][rColumn -1] = head.val;
                    head = head.next;
                }else {
                    result[i][rColumn -1] = -1;
                }
                c--;
            }
            rColumn --;
            if(c == 0) break;
            for(int i = rColumn -1; i >= lColumn; i--) {
                if(head != null) {
                    result[lRow -1][i] = head.val;
                    head = head.next;
                }else {
                    result[lRow -1][i] = -1;
                }
                c--;
            }
            lRow --;
            if(c == 0) break;
            for(int i = lRow-1; i >= uRow; i--) {
                if(head != null) {
                    result[i][lColumn] = head.val;
                    head = head.next;
                }else {
                    result[i][lColumn] = -1;
                }
                c--;
            }
            lColumn ++;

            
        }
        return result;
    }
}