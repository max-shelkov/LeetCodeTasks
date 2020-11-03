

public class Solution {

    //done

    public static void main(String[] args) {
        ListNode inputL1 = new ListNode(3);
        inputL1.next = new ListNode(7);
//        inputL1.next.next = new ListNode(3);
//        inputL1.next.next.next = new ListNode(1);
//        inputL1.next.next.next.next = new ListNode(2);
//        inputL1.next.next.next.next.next = new ListNode(3);

        ListNode inputL2 = new ListNode(9);
        inputL2.next = new ListNode(2);
//        inputL2.next.next = new ListNode(4);
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        ListNode res = solution.addTwoNumbers(inputL1, inputL2);
        long finish = System.currentTimeMillis();
        while (res != null){
            System.out.print(" -> " + res.val);
            res = res.next;
        }
        System.out.println();
        System.out.println("time = " + (finish - start));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1Node = l1;
        ListNode l2Node = l2;
        ListNode sumNode = null;
        ListNode res = null;
        int decades = 0;
        while (l1Node!=null&&l2Node!=null){
            int sum = (l1Node.val+l2Node.val + decades)%10;
            if (sumNode!=null){
                sumNode.next = new ListNode(sum);
                sumNode = sumNode.next;
            } else{
                sumNode = new ListNode(sum);
                res = sumNode;
            }
            decades = (l1Node.val+l2Node.val+decades)/10;
            l1Node = l1Node.next;
            l2Node = l2Node.next;
        }
        ListNode longerListNode = null;
        if (l1Node!=null) longerListNode = l1Node;
        if (l2Node!=null) longerListNode = l2Node;
        if (longerListNode!=null){
            while (longerListNode!=null){
                int sum = (longerListNode.val+decades)%10;
                assert sumNode!=null;
                sumNode.next = new ListNode(sum);
                decades = (longerListNode.val+decades)/10;
                sumNode = sumNode.next;
                longerListNode = longerListNode.next;
            }
        }
        if (decades>0) sumNode.next = new ListNode(decades);
        return res;

    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

