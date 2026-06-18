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
    int preindex=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootval=preorder[preindex];
        preindex++;
        TreeNode root=new TreeNode(rootval);
        int inorderIndex=map.get(rootval);
        root.left=helper(preorder,left,inorderIndex-1);
        root.right=helper(preorder,inorderIndex+1,right);
        return root;
    }
}
