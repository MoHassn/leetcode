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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        ArrayList<TreeNode> row = new ArrayList<>();
        row.add(root);
        while(!row.isEmpty()) {
            ArrayList<TreeNode> next = new ArrayList<>();
            for(TreeNode n: row) {
                if(check(head, n)) return true;
                if(n.left != null) next.add(n.left);
                if(n.right != null) next.add(n.right);
            }
            row = next;

        }
        return false;
    }

    public boolean check(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        if(head.val != root.val) return false;
        return check(head.next, root.right) || check(head.next, root.left);
    }
}