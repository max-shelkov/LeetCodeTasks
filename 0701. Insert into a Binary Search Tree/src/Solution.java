public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int input = 5;
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        long start = System.currentTimeMillis();
        TreeNode res = solution.insertIntoBST(root, input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) return new TreeNode(val);
        TreeNode pointer = root;
        TreeNode save = null;
        do{
            save = pointer;
            pointer = (pointer.val>val)? pointer.left : pointer.right;
        }while(pointer != null);

        if(save.val<val){
            save.right = new TreeNode(val);
        }else{
            save.left = new TreeNode(val);
        }
        return root;
    }

}



