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
    int count=0;
    boolean isUni(TreeNode node){
        if(node.left==null && node.right==null){
            count++;
            return true;
        }
        boolean isUniVal=true;
        if(node.left!=null){
            isUniVal=isUni(node.left) && isUniVal && node.left.val==node.val;
        }
        if(node.right!=null){
            isUniVal=isUni(node.right) && isUniVal && node.right.val==node.val;
        }
        if(!isUniVal) return false;
        count++;
        return true;
    }
    public int countUnivalSubtrees(TreeNode root) {
        if(root==null) return 0;
        isUni(root);
        return count;
    }
}