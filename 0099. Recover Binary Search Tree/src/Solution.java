public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        Solution solution = new Solution();
        solution.lookForNodesToBeSwapped(root);

    }

    TreeNode a;
    TreeNode b;
    TreeNode tmp;
    public void recoverTree(TreeNode root) {
        if (root == null) return;
        lookForNodesToBeSwapped(root);
        int keeper = a.val;
        a.val = b.val;
        b.val = keeper;
        return;
    }

    private void lookForNodesToBeSwapped(TreeNode root){
        if (root == null) return;
        lookForNodesToBeSwapped(root.left);
        if (tmp != null && tmp.val > root.val){
            b = root;
            if (a != null) {
                return;
            } else {
                a = tmp;
            }
        }
        tmp = root;
        lookForNodesToBeSwapped(root.right);
    }



}

class TreeNode {
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
