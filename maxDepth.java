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
    public int maxDepth(TreeNode root) {
        List<Integer> dep=new ArrayList<>();
        int level=0;
        if (root==null) {
            return 0;
        }
        dep.add(0,1);
        depth(root,dep,level);
        
        return dep.size();
    }
     public static void depth(TreeNode root,List<Integer> d,int l) {
         if(root!=null) {
             l++;
             if(root.left!=null) {
                 if (d.size()<l+1) {
                     d.add(1);
                 }

                 depth(root.left,d,l);
             }
             if(root.right!=null) {
                 if (d.size()<l+1) {
                     d.add(1);
                 }

                 depth(root.right, d,l);
             }
         }
     }
}
