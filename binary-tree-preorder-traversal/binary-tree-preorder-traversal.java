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
    public TreeNode getRightMostNode(TreeNode rightMost,TreeNode curr){
        while((rightMost.right!=null) && (rightMost.right!=curr))
            rightMost=rightMost.right;
        return rightMost;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        //Method:2 (Morris Traversal)
        LinkedList<Integer> ans=new LinkedList<>();
        TreeNode curr=root;
        while(curr!=null){
            TreeNode leftNode=curr.left;
            if(leftNode==null){
                ans.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode rightMostNode=getRightMostNode(leftNode,curr);
                if(rightMostNode.right==null){
                    //Thread needs to be created
                    ans.add(curr.val);
                    rightMostNode.right=curr;
                    curr=curr.left;
                }else{
                    //Delete Thread
                    rightMostNode.right=null;
                    curr=curr.right;
                }
            }
        }
        return ans;
        
        // Method 1( Trivial :Stack)
        // LinkedList<TreeNode> stack=new LinkedList<>();
        // LinkedList<Integer> output =new LinkedList<>();
        // if(root== null){
        //     return output;
        // }
        // stack.add(root);
        // while(!stack.isEmpty()){
        //     TreeNode node=stack.pollLast();
        //     output.add(node.val);
        //     if(node.right!=null){
        //         stack.add(node.right);
        //     }
        //     if(node.left!=null){
        //         stack.add(node.left);
        //     }
        // }
        // return output;
    }
}