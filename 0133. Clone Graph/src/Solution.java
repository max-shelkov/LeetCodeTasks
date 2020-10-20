import java.util.ArrayList;
import java.util.List;

public class Solution {

    //done

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List<Node> neighbors1 = new ArrayList<>();
        neighbors1.add(node2);
        neighbors1.add(node4);
        List<Node> neighbors2 = new ArrayList<>();
        neighbors2.add(node1);
        neighbors2.add(node3);
        List<Node> neighbors3 = new ArrayList<>();
        neighbors3.add(node2);
        neighbors3.add(node4);
        List<Node> neighbors4 = new ArrayList<>();
        neighbors4.add(node1);
        neighbors4.add(node3);
        node1.neighbors = neighbors1;
        node2.neighbors = neighbors2;
        node3.neighbors = neighbors3;
        node4.neighbors = neighbors4;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        Node res = solution.cloneGraph(node1);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (node.neighbors == null || node.neighbors.size() == 0) return new Node(node.val);
        return copyNode(new ArrayList<>(), node);
    }

    private Node copyNode(List<Node> list, Node node){

            Node check = checkForNewNode(list, node.val);
            if (check != null) return check;
            Node newNode = new Node(node.val);
            list.add(newNode);
            for (Node n: node.neighbors) {
                newNode.neighbors.add(copyNode(list, n));
            }
            return newNode;
        }

        private Node checkForNewNode(List<Node> list, int val){
            for (Node node : list){
                if (node.val == val) return node;
            }
            return null;
        }

}
