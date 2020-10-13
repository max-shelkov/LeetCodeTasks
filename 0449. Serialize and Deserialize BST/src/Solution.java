import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Solution solution = new Solution();

        String res = solution.serialize(root);
        System.out.println("res = " + res);

    }

    private final String divider = ",";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        nodeToString(sb, root);
        return sb.toString();
    }


    public TreeNode deserialize(String data) {
        if(data.equals("")){
            return null;
        }
        String[] strValues = data.split(divider);
        TreeNode rootNode = new TreeNode(Integer.parseInt(strValues[0]));
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(rootNode);

        for(int i=1; i<strValues.length; i++){
            int val  = Integer.parseInt(strValues[i]);
            TreeNode node = null;
            while(deque.size()>0 && deque.peekLast().val<val){
                node = deque.pollLast();
            }
            TreeNode newNode = new TreeNode(val);
            if(node!=null){
                node.right = newNode;
            }else{
                assert deque.peekLast() != null;
                deque.peekLast().left = newNode;
            }

            deque.offerLast(newNode);
        }

        return rootNode;
    }

    private void nodeToString(StringBuilder sb, TreeNode node){
        if(node==null) return;
        sb.append(node.val).append(divider);
        nodeToString(sb, node.left);
        nodeToString(sb, node.right);
    }


}
