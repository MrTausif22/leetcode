/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// class Solution {
   
//     public List<Integer> preorder(Node root) {
//         List<Integer> output = new ArrayList<>();
//         if (root == null) return output;

//         output.add(root.val);
//         for(Node child: root.children){
//             preorder(child);
//         }
//         return output;
//     }
// }

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        dfs(root, output);
        return output;
    }

    private void dfs(Node root, List<Integer> output) {
        if (root == null) return;

        output.add(root.val);

        for (Node child : root.children) {
            dfs(child, output);
        }
    }
}