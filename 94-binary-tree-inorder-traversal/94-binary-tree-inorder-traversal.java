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
    private TreeNode getRightMostNode(TreeNode rightMost,TreeNode curr){
        while(rightMost.right!=null && rightMost.right!=curr)
            rightMost=rightMost.right;
        return rightMost;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> result=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            result.add(curr.val);
            curr=curr.right;
        }
        return result;
        // TreeNode curr=root;
        // while(curr!=null){
        //     TreeNode leftNode=curr.left;
        //     if(leftNode==null){
        //         result.add(curr.val);
        //         curr=curr.right;
        //     }else{
        //         TreeNode rightMostNode=getRightMostNode(leftNode,curr);
        //         if(rightMostNode.right==null){
        //             //Thread needs to be created
        //             rightMostNode.right=curr;
        //             curr=curr.left;
        //         }else{
        //             //Thread needs to be deleted
        //             rightMostNode.right=null;
        //             result.add(curr.val);
        //             curr=curr.right;
        //         }
        //     }
        // }
        // return result;
    }
}