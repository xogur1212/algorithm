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
    public boolean isSymmetric(TreeNode root) {
        //초기화
        

        return bfs(root);
     
        
    
        
    }
    
    public boolean bfs(TreeNode root) {
        
        Queue<TreeNode> nodeQueue = new LinkedList<>();
     
        nodeQueue.add(root);
        
        while(!nodeQueue.isEmpty()){

            int n = nodeQueue.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0 ; i < n ; i++){
                
                TreeNode currentNode = nodeQueue.poll();

                if(currentNode == null)
                    list.add(null);
                else {
                    list.add(currentNode.val);
                    nodeQueue.add(currentNode.left);
                    nodeQueue.add(currentNode.right);
                }
                
             
            }
            
               if(!checkSymmetric(list)) return false;
        }

        return true;
    }
    
    public boolean checkSymmetric(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while(left < right) {
            if(list.get(left) != list.get(right)){
               
                return false;
            }
            left++;
            right--;
        }
         

            return true;
    }
    
}