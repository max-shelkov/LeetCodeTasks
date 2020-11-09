public class Solution {

    //done

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new     TreeNode(13);

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.maxAncestorDiff(root);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    private int maxValue = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        checkNode(root);
        return maxValue;
    }

    private void checkNode(TreeNode node) {
        if (node == null) return;
        maxValue = Math.max(maxValue, findMaxDif(node, node.val));
        checkNode(node.left);
        checkNode(node.right);

    }

    private int findMaxDif(TreeNode node, int val){
        if (node == null) return 0;
        int res = Math.abs(node.val - val);
        int resLeft = findMaxDif(node.left, val);
        int resRight = findMaxDif(node.right, val);
        return Math.max(res, Math.max(resLeft, resRight));
    }



/*
    private void checkNode(TreeNode node){
        if (node == null) return;
        int v = Math.abs(node.val - findMinValue(node, Integer.MAX_VALUE));
        maxValue = Math.max(maxValue, v);
        checkNode(node.left);
        checkNode(node.right);
    }

    private int findMinValue(TreeNode node, int min){
        if (node == null) return Integer.MAX_VALUE;
        min = Math.min(min, node.val);
        min = Math.min(min, findMinValue(node.left, min));
        min = Math.min(min, findMinValue(node.right, min));
        return min;
    }
*/


}

