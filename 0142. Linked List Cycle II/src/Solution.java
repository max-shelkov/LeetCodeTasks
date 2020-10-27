import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        ListNode node = root;
//        root.next = new ListNode(2);
//        root.next.next = new ListNode(0);
//        root.next.next.next = new ListNode(-4);
//        root.next.next.next.next = root.next;
        ListNode cycleNode = null;
        for (int i = 0; i < 1000; i++) {
            node.next = new ListNode(i);
            node = node.next;
            if (i == 501) cycleNode = node;
        }
        node.next = cycleNode;


        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        ListNode res = solution.detectCycle(root);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res.val);
        System.out.println("time = " + (finish - start));

    }

    public ListNode detectCycle(ListNode head) {
        ListNode node = head;
        Set<ListNode> set = new HashSet<>();
        while (node!=null){
            if (!set.add(node)) return node;
            node = node.next;
        }
        return null;
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
