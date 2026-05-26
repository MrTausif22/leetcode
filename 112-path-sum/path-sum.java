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
// class Solution {
//     public boolean hasPathSum(TreeNode root, int targetSum) {

//         if(root == null){
//             return false;
//         }
//         Stack<TreeNode> path = new Stack<>();
//         Stack<Integer> sumPath = new Stack<>();

//         path.push(root);
//         sumPath.push(root.val);

//         while(!path.isEmpty()){
//             TreeNode temp = path.pop();
//             int tempVal = sumPath.pop();

//             if(temp.left == null && temp.right == null && tempVal == targetSum){
//                 return true;
//             }
//             if(temp.left != null){
//                 path.push(temp.left);
//                 sumPath.push(temp.left.val + tempVal);
//             }
//             if(temp.right != null){
//                 path.push(temp.right);
//                 sumPath.push(temp.right.val + tempVal);
//             }
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean hasPathSum(TreeNode root, int targetSum) {

//         if(root == null){
//             return false;
//         }
//         // int currSum = 0;
//         if(root.left == null && root.right == null ){
//             return root.val == targetSum ;
//         }
//         return hasPathSum(root.left ,targetSum - root.val) || hasPathSum(root.righttargetSum - root.val);

//     }
// }

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }
}
