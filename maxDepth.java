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
 public class HelloWorld{
    static int depth_l=0,depth_r=0;
     public static void main(String []args){
        System.out.println("Hello World");
        TreeNode l=new TreeNode(15);
        TreeNode r=new TreeNode(7);
        TreeNode left=new TreeNode(9,null,null);
        TreeNode right=new TreeNode(20,l,null);
        TreeNode root= new TreeNode(3,left, right);
        maxDepth(root);
        //root(3);
        //root ={3,9,20,null,null,15,7};
        System.out.println("depth_l="+(depth_l+1));
        System.out.println("depth_r="+(depth_r+1));
     }
     public static void maxDepth(TreeNode root) {
         if(root.left!=null) {
             depth_l++;
             maxDepth(root.left);
         }
         if(root.right!=null) {
             depth_r++;
             maxDepth(root.right);
         }
     }
     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
  }
}
