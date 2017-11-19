/* Difficulty: easy 
 *
 * Invert a binary tree.
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 
 * to
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 * Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t
 * invert a binary tree on a whiteboard so fuck off.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
*/

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp, node;
        queue.add(root);
        while( (node = queue.poll()) != null ) {
            if(node.left == null && node.right == null)
                continue;
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
            temp = node.right;
            node.right = node.left;
            node.left = temp;
        }
        return root;
    }
}