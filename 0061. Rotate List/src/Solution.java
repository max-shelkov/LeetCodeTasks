

public class Solution {

    public static void main(String[] args) {
        int k = 0;
        ListNode root = null;
//                new ListNode(1);
/*
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
*/
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        ListNode res = solution.rotateRight(root, k);
        long finish = System.currentTimeMillis();
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
        System.out.println("time = " + (finish-start));

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k==0) return head;
        int size = 0;
        ListNode node = head;
        ListNode temp = null;
        while (node!=null){
            size++;
            temp = node;
            node = node.next;
        }
        temp.next = head;
        int lastNodeNum = size - k%size;
        ListNode firstNode = head;
        for (int i = 0; i < lastNodeNum; i++){
            if (i==lastNodeNum-1){
                ListNode lastNode = firstNode;
                firstNode = firstNode.next;
                lastNode.next = null;

            } else {
                firstNode = firstNode.next;
            }

        }
        return firstNode;
    }

}
