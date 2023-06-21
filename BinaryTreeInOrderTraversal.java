/* Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */
// class Solution {
//     private List<Integer> res=new ArrayList<>();
//     public List<Integer> inorderTraversal(TreeNode root) {
//         traverse(root);
//         return res;
//     }
//     private void traverse(TreeNode root){
//         if(root==null) return;
//         traverse(root.left);
//         res.add(root.val);
//         traverse(root.right);
//     }
// }
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
        if(root == null) return list;
            Stack<TreeNode> stack = new Stack<>();
            while(root != null || !stack.empty()){
                while(root != null){
                stack.push(root);
                root = root.left;
                }
                root = stack.pop();
                list.add(root.val);
                root = root.right;
        
             }
         return list;
    }
}