public class Solution {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(7);
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        Node res = solution.connect(root);
        long finish = System.currentTimeMillis();
        System.out.println("time = " + (finish-start));
    }

    public Node connect(Node root) {
        setNext(root);
        return root;
    }

    private void setNext(Node node){
        if (node == null) return;
        if (node.left != null) node.left.next = node.right;
        if (node.right != null)
            if (node.next!=null){
                node.right.next = node.next.left;
            } else {
                node.right.next = null;
            }
        setNext(node.left);
        setNext(node.right);
    }

}
