public class Solution {
    public static void main(String[] args) {
        ListNode input = new ListNode(4);
        input.next = new ListNode(2);
        input.next.next = new ListNode(1);
        input.next.next.next = new ListNode(3);
        while (input != null){
            System.out.print(" -> " + input.val);
            input = input.next;
        }
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        ListNode res = solution.insertionSortList(input);
        long finish = System.currentTimeMillis();
        while (res != null){
            System.out.print(" -> " + res.val);
            res = res.next;
        }
        System.out.println();
        System.out.println("time = " + (finish - start));

    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode tmp = new ListNode(Integer.MIN_VALUE, head);
        ListNode node=head;

        while (node.next!=null) {

            if (node.next.val>=node.val) {
                node=node.next;
            } else {
                ListNode n = node.next;
                node.next = n.next;
                n.next = null;
                ListNode pointer = tmp;
                while (pointer.next.val < n.val) {
                    pointer = pointer.next;
                }
                n.next = pointer.next;
                pointer.next = n;
            }
        }
        return tmp.next;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

