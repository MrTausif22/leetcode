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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPathSum(root, targetSum,result,new ArrayList<>());
        return result;
    }
    public void findPathSum(TreeNode root, int target, List<List<Integer>> result, List<Integer> current){
        if(root == null){
            return ;
        }
        current.add(root.val);
        if(root.left == null && root.right == null && target - root.val == 0){
            result.add(new ArrayList(current));
        }
        findPathSum(root.left, target-root.val,result,current);
        findPathSum(root.right, target-root.val,result,current);

        current.remove(current.size()-1);
    }
}