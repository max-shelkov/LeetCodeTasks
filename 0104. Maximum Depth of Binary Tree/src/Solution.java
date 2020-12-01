public class Solution {



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.maxDepth(root);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    private int res = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        checkNode(root, 0);
        return res;
    }

    private void checkNode(TreeNode node, int counter){
        if (node == null) {
            res = Math.max(counter, res);
            return;
        }
        checkNode(node.left, counter+1);
        checkNode(node.right, counter+1);
    }


/*
    private void checkNode(TreeNode node, int counter){
        if (node.left == null && node.right==null) res = Math.max(res, counter);
        if (node.left !=null && counter<res) checkNode(node.left,  counter+1);
        if (node.right!=null && counter<res) checkNode(node.right, counter+1);
    }
*/

}
