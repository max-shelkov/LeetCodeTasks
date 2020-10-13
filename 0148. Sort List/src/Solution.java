import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {


        ListNode root = new ListNode(4);
        root.next = new ListNode(2);
        root.next.next = new ListNode(1);
        root.next.next.next = new ListNode(3);
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        ListNode res = solution.sortList1(root);
        long finish = System.currentTimeMillis();
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
        System.out.println("time = " + (finish-start));

    }

    public ListNode sortList1(ListNode head){
        if (head == null) return null;
        ListNode node = head;
        while (node.next!=null){
            if (node.val > node.next.val){
                int tmp = node.val;
                node.val = node.next.val;
                node.next.val = tmp;
                node = head;
                continue;
            }
            node = node.next;
        }
        return head;
    }

    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        ListNode node = head;
        ArrayList<ListNode> list = new ArrayList<>();
        while (node!=null){
            list.add(node);
            node = node.next;
        }

        list.sort((node1, node2) -> {
            if (node1.val == node2.val) return 0;
            return (node1.val > node2.val) ? 1 : -1;
        });

        ListNode res = list.get(0);
        ListNode end = res;

        for (int i=1; i<list.size(); i++) {
            end.next = list.get(i);
            end = end.next;
        }
        end.next = null;
        return res;
    }

}
