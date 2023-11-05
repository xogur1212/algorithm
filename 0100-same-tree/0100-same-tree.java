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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null && q== null) 
            return true;
        if(p == null || q == null || p.val != q.val)
            return false;

        Queue<TreeNode> pQueue = new ArrayDeque<>();
        Queue<TreeNode> qQueue = new ArrayDeque<>();
        pQueue.add(p);
        qQueue.add(q);

        while(!pQueue.isEmpty() ) {
            
          
            TreeNode pQueueNode = pQueue.poll();
            TreeNode qQueueNode = qQueue.poll();

            if(pQueueNode == null || qQueueNode == null || pQueueNode.val != qQueueNode.val)
                return false;
            
            if(pQueueNode.left == null && qQueueNode.left != null)
                return false;
            if(pQueueNode.left != null && qQueueNode.left == null)
                return false;

            if(pQueueNode.right == null && qQueueNode.right != null)
                return false; 
            if(pQueueNode.right != null && qQueueNode.right == null)
                return false; 
            
            if(pQueueNode.left != null){
                pQueue.add(pQueueNode.left);
                qQueue.add(qQueueNode.left);
            }
            if(qQueueNode.right != null) {
                pQueue.add(pQueueNode.right);
                qQueue.add(qQueueNode.right);
            }
                

    


            
        }

        return pQueue.isEmpty() && qQueue.isEmpty();
    }
}