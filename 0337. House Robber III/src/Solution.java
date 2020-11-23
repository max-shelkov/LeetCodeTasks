public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.rob(root);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }


    public int rob(TreeNode root) {

        int first = robHouse(root, true, 0);
        int second = robHouse(root, false, 0);
        return Math.max(first, second);
    }

    private int robHouse(TreeNode node, boolean allowed, int money){
        if (node == null) return 0;
        int leftRob;
        int rightRob;
        if (allowed){
            leftRob = robHouse(node.left, false, money);
            rightRob = robHouse(node.right, false, money);
            money += leftRob + rightRob + node.val;
        } else {
            leftRob = Math.max(robHouse(node.left, false, money), robHouse(node.left, true, money));
            rightRob = Math.max(robHouse(node.right, false, money), robHouse(node.right, true, money));
            money += leftRob + rightRob;
        }

        return money;
    }

}
