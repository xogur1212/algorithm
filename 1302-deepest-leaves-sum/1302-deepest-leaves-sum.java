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

    int answer = 0; 
    int maxLevel = 0;
    public int deepestLeavesSum(TreeNode root) {
        
       

        int level = 0;
        
        dfs(root,level);

        return answer;
        
    }

    private void dfs (TreeNode node, int level){
        
        

        if(level > maxLevel) {
            answer = 0;
            maxLevel =level;
        }
        if(level == maxLevel) {
            answer += node.val;
        }
        
        if(node.right != null){
             dfs(node.right, level + 1);
        }
        if(node.left != null) {
             dfs(node.left ,level +1);
        }

        
    }
}