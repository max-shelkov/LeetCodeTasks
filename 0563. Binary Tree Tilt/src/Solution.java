public class Solution {

    //done

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(9);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.findTilt(root);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    private int res = 0;
    public int findTilt(TreeNode root) {
        if (root == null || (root.right==null && root.left==null)) return 0;
        getTiltSum(root);
        return res;
    }

    private void getTiltSum(TreeNode node){
        if (node == null || (node.right==null && node.left==null)) return;
        getTiltSum(node.left);
        getTiltSum(node.right);
        res += Math.abs(getValsSum(node.left) - getValsSum(node.right));
    }

    private int getValsSum(TreeNode node){
        if (node == null) return 0;
        if (node.right==null && node.left==null) return node.val;
        return getValsSum(node.left)+getValsSum(node.right) + node.val;
    }

}
