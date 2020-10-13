import java.util.ArrayList;

// Time Limit Exceeded
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
class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(10);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.left.left.left = new TreeNode(11);
/*
        root.left.left.right = new TreeNode(8);
        root.right.left.left = new TreeNode(6);
        root.right.right.right = new TreeNode(2);
*/

        Solution solution = new Solution();
        boolean res = solution.isEvenOddTree(root);
        System.out.println("res = " + res);

    }

    ArrayList<Integer> levelList;
    public boolean isEvenOddTree(TreeNode root) {
        if (root==null) return false;
        if (root.val%2==0) return false;
        int depth = getMaxDepth(root, 0);
        for (int level = 0; level<depth; level++){
            levelList = new ArrayList<>();
            boolean isLevelOdd = level % 2 == 1;
            checkLevel(root, level);
            if (levelList.size() == 1){
                if (isLevelOdd && levelList.get(0)%2==1) return false;
                if (!isLevelOdd && levelList.get(0)%2==0) return false;

            }
            for (int num=1; num<levelList.size(); num++){
                if (levelList.size()>1) {
                    if (isLevelOdd){
                        if (levelList.get(num) % 2 == 1 || levelList.get(num-1) <= levelList.get(num)) return false;
                    } else {
                        if (levelList.get(num) % 2 == 0 || levelList.get(num-1) >= levelList.get(num)) return false;
                    }
                }

            }
        }
        return true;
    }

    private void checkLevel(TreeNode node, int level ){
        if (node == null) return;
        checkLevel(node.left, level-1);
        checkLevel(node.right, level-1);
        if (level == 0) {
            System.out.println(node.val);
            levelList.add(node.val);
        }
    }

    private int getMaxDepth(TreeNode node, int depth){
        if (node == null) return depth;
        return Math.max(getMaxDepth(node.left, depth+1), getMaxDepth(node.right, depth+1));
    }

}