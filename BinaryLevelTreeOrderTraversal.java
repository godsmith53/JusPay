/*Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000 */
Class Solution{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode current=queue.remove();
                currentLevel.add(current.val);
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}