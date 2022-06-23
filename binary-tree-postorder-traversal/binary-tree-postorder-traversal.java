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
    // List<Integer> result=new ArrayList<>();
    
    private TreeNode getLeftMostNode(TreeNode leftNode,TreeNode curr){
        while(leftNode.left!=null && leftNode.left!=curr)
            leftNode=leftNode.left;
        return leftNode;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        //Method 2( Using Morris)
  LinkedList<Integer> result= new LinkedList<>();
        TreeNode curr=root;
        while(curr!=null){
            TreeNode rightNode=curr.right;
            if(rightNode==null){
                result.add(curr.val);
                curr=curr.left;
            }else{
                TreeNode leftMostNode=getLeftMostNode(rightNode,curr);
                if(leftMostNode.left==null){
                    //Thread has to be created
                    result.add(curr.val);
                    leftMostNode.left=curr;
                    curr=curr.right;
                }else{
                    //Thread has to be deleted
                    leftMostNode.left=null;
                    
                    curr=curr.left;
                }
            }
        }
        Collections.reverse(result);;
        return result;
        
        
        
        
//         if(root==null)
//             return result;
//         postorderTraversal(root.left);
//         postorderTraversal(root.right);
//         result.add(root.val);
        
//         return result;
        
        
    }
}