public class Solution {
    public static void main(String[] args) {
        int[] input = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        ListNode head = new ListNode(input[0]);
        ListNode node = head;
        for (int i = 1; i < input.length; i++) {
            node.next = new ListNode(input[i]);
            node = node.next;
        }
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.getDecimalValue(head);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int getDecimalValue(ListNode head) {
        if (head == null) return 0;
        StringBuilder binary = new StringBuilder();
        while (head!=null){
            binary.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(binary.toString(), 2);
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
