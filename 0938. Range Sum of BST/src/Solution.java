public class Solution {

    //done

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        int low = 7;
        int high = 15;


        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.rangeSumBST(root, low, high);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    private int res = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        checkNode(root, low, high);
        return res;
    }

    private void checkNode(TreeNode node, int min, int max){
        if (node == null) return;
        if (node.val >= min && node.val <=max) res += node.val;
        checkNode(node.left, min, max);
        checkNode(node.right, min, max);
    }

}
